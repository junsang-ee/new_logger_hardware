package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "order_product")
public class OrderProductEntity extends CreationLocalDateTimeEntity {
    @ManyToOne
    @JoinColumn(name = "product", nullable = false)
    private ProductEntity product;

    private int orderProductCount;
}
