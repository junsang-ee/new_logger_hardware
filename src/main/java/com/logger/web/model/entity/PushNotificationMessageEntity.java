package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity(name = "push_notification_message")
public class PushNotificationMessageEntity extends CreationLocalDateTimeEntity {
    private String title;

    private String message;

    private LocalDateTime sentAt;

    private LocalDateTime readAt;

    @ManyToOne
    @JoinColumn(name = "user")
    private UserEntity user;
}
