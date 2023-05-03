package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "client")
public class ClientEntity extends CreationLocalDateTimeEntity {
    private String name;

    private String address;

    private String zipCode;

    @OneToMany(mappedBy = "client")
    private List<OrderInfoEntity> orders;
}
