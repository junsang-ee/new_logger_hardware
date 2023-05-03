package com.logger.web.model.entity;

import com.logger.web.model.entity.common.ModificationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Entity;
import javax.persistence.PrePersist;

@Getter
@Setter
@NoArgsConstructor
@DynamicInsert
@Entity(name = "user_login_info")
public class UserLoginInfoEntity extends ModificationLocalDateTimeEntity {

    private int loginFailCount;

    private String tempPassword;

    @PrePersist
    private void onPrevisionPersist() {
        this.loginFailCount = 0;
    }

}
