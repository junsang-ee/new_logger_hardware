package com.logger.web.model.entity;

import com.logger.web.constant.LoggerStatus;
import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "logger")
public class LoggerEntity extends CreationLocalDateTimeEntity {
    private String name;

    private String macAddress;

    private int serialNumber;

    private int battery;

    @Enumerated(EnumType.STRING)
    private LoggerStatus status;

    private double firmware;

    private LocalDateTime connectedAt;

    @PrePersist
    public void onPrevisionPersist() {
        this.setBattery(100);
        this.setStatus(LoggerStatus.valueOf(LoggerStatus.WAITING.name()));
        this.connectedAt = null;
    }



}
