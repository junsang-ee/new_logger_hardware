package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "product")
public class ProductEntity extends CreationLocalDateTimeEntity {
    private String name;

    private long cost;

}
