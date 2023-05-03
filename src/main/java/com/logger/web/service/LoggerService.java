package com.logger.web.service;

import com.logger.web.model.dto.request.LoggerGroupSaveRequest;
import com.logger.web.model.dto.request.LoggerSaveRequest;
import com.logger.web.model.entity.LoggerEntity;
import com.logger.web.model.entity.LoggerGroupEntity;

public interface LoggerService {
    LoggerEntity save(LoggerSaveRequest loggerSaveRequest, String userId);

    LoggerEntity get(String loggerId);

    LoggerGroupEntity setGroup(LoggerGroupSaveRequest loggerGroupSaveRequest);
}
