package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    @JoinColumn(name = "appPush")
    private AppPushEntity appPush;

}
