package com.logger.web.model.entity;

import com.logger.web.model.entity.common.CreationLocalDateTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "logger_group")
public class LoggerGroupEntity extends CreationLocalDateTimeEntity {
    private String name;

    @OneToMany(mappedBy = "group")
    private List<LoggerEntity> loggers;

    @ManyToOne
    @JoinColumn(name = "createdBy", nullable = false)
    private UserEntity createdBy;

}
