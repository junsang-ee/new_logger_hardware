package com.logger.web.model.entity;

import com.logger.web.constant.NotificationAgreementStatusType;
import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrePersist;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "user_notification_preferences")
public class UserNotificationPreferencesEntity extends CreationLocalDateTimeEntity {

    @Enumerated(EnumType.STRING)
    private NotificationAgreementStatusType eventNotificationAgreementStatusType;

    @Enumerated(EnumType.STRING)
    private NotificationAgreementStatusType nightNotificationAgreementStatusType;

    @PrePersist
    private void prePersist() {
        this.eventNotificationAgreementStatusType = NotificationAgreementStatusType.NOT_AGREED;
        this.nightNotificationAgreementStatusType = NotificationAgreementStatusType.NOT_AGREED;
    }
}
