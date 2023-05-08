package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@DynamicInsert
@Entity(name = "user")
public class UserEntity extends CreationLocalDateTimeEntity implements Serializable {

    private String name;

    private String email;

    private String phoneNumber;

    private String password;

    private String profileImage;

    private String registrationCode;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "notificationPreferences")
    private UserNotificationPreferencesEntity notificationPreferences;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "loginInfo")
    private UserLoginInfoEntity loginInfo;

    @ManyToOne
    @JoinColumn(name = "company")
    private CompanyEntity company;

    @PrePersist
    private void setDefaultRelationShipData() {
        this.notificationPreferences = new UserNotificationPreferencesEntity();
        this.loginInfo = new UserLoginInfoEntity();
    }

}
