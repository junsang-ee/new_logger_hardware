package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "logger_status_history")
public class LoggerStatusHistoryEntity extends CreationLocalDateTimeEntity {

    private double temperature;

    private double humidity;

    private int cumulativeCrash;

    @ManyToOne
    @JoinColumn(name = "order_info", nullable = false)
    private OrderInfoEntity orderInfo;
}