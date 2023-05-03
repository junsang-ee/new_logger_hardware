package com.logger.web.repository;

import com.logger.web.model.entity.LoggerGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerGroupRepository extends JpaRepository<LoggerGroupEntity, String> {
}
