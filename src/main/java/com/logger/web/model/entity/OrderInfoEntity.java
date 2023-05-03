package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "order_info")
public class OrderInfoEntity extends CreationLocalDateTimeEntity {
    private int orderNumber;

    @ManyToOne
    @JoinColumn(name = "client", nullable = false)
    private ClientEntity client;

    @OneToOne
    @JoinColumn(name = "order_product", nullable = false)
    private OrderProductEntity orderProduct;

    @ManyToOne
    @JoinColumn(name = "logger")
    private LoggerEntity logger;

    @OneToMany(mappedBy = "orderInfo")
    private List<LoggerStatusHistoryEntity> statusHistories;
}
