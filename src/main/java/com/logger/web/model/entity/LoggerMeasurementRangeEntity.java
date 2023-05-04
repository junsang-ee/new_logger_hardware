package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import com.logger.web.model.entity.range.DefaultSingleCustomMeasurementRangeEntity;
import com.logger.web.model.entity.range.HumidityRangeEntity;
import com.logger.web.model.entity.range.TemperatureRangeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "logger_measurement_range")
public class LoggerMeasurementRangeEntity extends CreationLocalDateTimeEntity {

    @ManyToOne
    @JoinColumn(name = "tempRange")
    private TemperatureRangeEntity tempRange;

    @ManyToOne
    @JoinColumn(name = "humidityRange")
    private HumidityRangeEntity humidityRange;

    @ManyToOne
    @JoinColumn(name = "defaultSingleCustomMeasurementRange")
    private DefaultSingleCustomMeasurementRangeEntity defaultSingleCustomMeasurementRange;
}
