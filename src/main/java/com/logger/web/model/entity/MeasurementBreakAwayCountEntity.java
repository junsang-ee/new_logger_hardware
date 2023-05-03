package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@NoArgsConstructor
@Entity(name = "measurement_break_away_count")
public class MeasurementBreakAwayCountEntity extends CreationLocalDateTimeEntity {

    private int temperatureBreakAwayCount;

    private int humidityBreakAwayCount;

    @OneToOne
    @JoinColumn(name = "orderInfo")
    private OrderInfoEntity orderInfo;
}
