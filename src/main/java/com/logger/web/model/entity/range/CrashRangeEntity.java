package com.logger.web.model.entity.range;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "crash_range")
public class CrashRangeEntity extends CreationLocalDateTimeEntity {
    private int lowestCrash;

    private int highestCrash;
}
