package com.logger.web.model.entity.range;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Getter
@NoArgsConstructor
@Entity(name = "default_single_measurement")
public class DefaultSingleCustomMeasurementRangeEntity extends CreationLocalDateTimeEntity {
    private int crashRange;

    private int measurementPeriod;

    private int measurementLatency;
}
