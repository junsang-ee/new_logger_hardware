package com.logger.web.model.entity.range;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "humidity_range")
public class HumidityRangeEntity extends CreationLocalDateTimeEntity {
    private double lowestHumidity;

    private double highestHumidity;
}
