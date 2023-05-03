package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Getter
@NoArgsConstructor
@Entity(name = "company")
public class CompanyEntity extends CreationLocalDateTimeEntity {
    private String name;

    private String departmentName;

    private int zipCode;

    private String address;

    private String detailAddress;

    private String representativeNumber;

    private String businessNumber;
}
