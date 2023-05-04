package com.logger.web.model.entity;

import com.logger.web.constant.ReceptionConsentType;
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
@Entity(name = "app_push")
public class AppPushEntity extends CreationLocalDateTimeEntity {

    @Enumerated(EnumType.STRING)
    private ReceptionConsentType eventOccurs;

    @Enumerated(EnumType.STRING)
    private ReceptionConsentType nightReception;

    @PrePersist
    private void prePersist() {
        this.eventOccurs = ReceptionConsentType.AGREEMENT;
        this.nightReception = ReceptionConsentType.AGREEMENT;
    }
}
