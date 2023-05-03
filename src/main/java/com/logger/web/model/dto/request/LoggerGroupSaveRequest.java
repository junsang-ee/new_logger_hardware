package com.logger.web.model.dto.request;

import com.logger.web.model.entity.LoggerMeasurementRangeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class LoggerGroupSaveRequest {
    private String name;

//    private GroupingType groupingType;

    private List<String> loggerIdList;

    private LoggerMeasurementRangeEntity loggerStatus;
}
