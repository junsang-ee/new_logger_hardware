package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "logger_measurement_range")
public class LoggerMeasurementRangeEntity extends CreationLocalDateTimeEntity {
    private double lowestTemperature;

    private double highestTemperature;

    private double lowestHumidity;

    private double highestHumidity;

    private int lowestCrash;

    private int highestCrash;

    private int dataMeasurementInterval;

    private int measurementWaitingTime;
}
