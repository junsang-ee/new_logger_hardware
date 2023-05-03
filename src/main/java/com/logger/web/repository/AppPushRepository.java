package com.logger.web.repository;

import com.logger.web.model.entity.AppPushEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppPushRepository extends JpaRepository<AppPushEntity, String > {
}
