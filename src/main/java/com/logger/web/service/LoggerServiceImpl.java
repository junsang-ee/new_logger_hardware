package com.logger.web.service;

import com.logger.web.model.dto.request.LoggerGroupSaveRequest;
import com.logger.web.model.dto.request.LoggerSaveRequest;
import com.logger.web.model.entity.LoggerEntity;
import com.logger.web.model.entity.LoggerGroupEntity;
import com.logger.web.repository.LoggerGroupRepository;
import com.logger.web.repository.LoggerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class LoggerServiceImpl implements LoggerService{
    private final LoggerRepository loggerRepository;

    private final LoggerGroupRepository loggerGroupRepository;

    private final UserService userService;

    @Transactional
    @Override
    public LoggerEntity save(LoggerSaveRequest loggerSaveRequest, String userId) {
        return loggerRepository.save(toSaveEntity(loggerSaveRequest, userId));
    }

    @Override
    public LoggerEntity get(String loggerId) {
        LoggerEntity logger = loggerRepository.findById(loggerId).orElseThrow(
                () -> new IllegalArgumentException("not found this logger")
        );
        return logger;
    }

    @Transactional
    @Override
    public LoggerGroupEntity setGroup(LoggerGroupSaveRequest loggerGroupSaveRequest) {
        LoggerGroupEntity loggerGroup = loggerGroupRepository.save(toSaveGroupEntity(loggerGroupSaveRequest));
        setGroup(loggerGroup);
        return loggerGroup;
    }

    private LoggerEntity toSaveEntity(LoggerSaveRequest loggerSaveRequest, String userId) {
        LoggerEntity logger = new LoggerEntity();
        logger.setName(loggerSaveRequest.getName());
        logger.setMacAddress(loggerSaveRequest.getMacAddress());
        logger.setSerialNumber(loggerSaveRequest.getSerialNumber());
        logger.setLoggerGroup(null);
        logger.setCreatedBy(userService.get(userId));
        return logger;
    }

    private LoggerGroupEntity toSaveGroupEntity(LoggerGroupSaveRequest loggerGroupSaveRequest) {
        LoggerGroupEntity loggerGroup = new LoggerGroupEntity();
        loggerGroup.setName(loggerGroupSaveRequest.getName());
//        loggerGroup.setConnectCount(loggerGroupSaveRequest.getLoggerIdList().size());
//        loggerGroup.setGroupingType(loggerGroupSaveRequest.getGroupingType());
        loggerGroup.setLoggers(loggerRepository.findAllById(loggerGroupSaveRequest.getLoggerIdList()));
//        loggerGroup.setLoggerStatus(null);
        return loggerGroup;
    }

    private void setGroup(LoggerGroupEntity loggerGroup) {
        for (LoggerEntity logger : loggerGroup.getLoggers()) {
            logger.setLoggerGroup(loggerGroup);
        }
    }

}
