package com.logger.web.model.entity;

import com.logger.web.constant.ShippingStatus;
import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "shipping")
public class ShippingEntity extends CreationLocalDateTimeEntity {

    @OneToOne
    @JoinColumn(name = "order_info")
    private OrderInfoEntity orderInfo;

    private LocalDateTime arrivedAt;

    @Enumerated(EnumType.STRING)
    private ShippingStatus status;

}
