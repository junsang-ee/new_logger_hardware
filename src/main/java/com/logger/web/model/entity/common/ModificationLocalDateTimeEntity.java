package com.logger.web.model.entity.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class ModificationLocalDateTimeEntity extends CreationLocalDateTimeEntity {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(nullable = false)
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
