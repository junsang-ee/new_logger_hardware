package com.logger.web.model.entity.range;

import com.logger.web.constant.TemperatureType;
import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "temperature_range")
public class TemperatureRangeEntity extends CreationLocalDateTimeEntity {

    @Enumerated(EnumType.STRING)
    private TemperatureType type;

    private double lowestTemperature;

    private double highestTemperature;

}
