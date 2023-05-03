package com.logger.web.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.logger.web.constant.LoggerStatus;
import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
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

    @JsonManagedReference // 순환참조 방지
    @ManyToOne
    @JoinColumn(name = "createdBy", nullable = false)
    private UserEntity createdBy;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "loggerGroup")
    private LoggerGroupEntity loggerGroup;

    @OneToOne
    @JoinColumn(name = "loggerStatus")
    private LoggerStatusEntity loggerStatus;

    @PrePersist
    public void onPrevisionPersist() {
        this.setBattery(100);
        this.setStatus(LoggerStatus.valueOf(LoggerStatus.WAITING.name()));
        this.connectedAt = null;
    }



}
