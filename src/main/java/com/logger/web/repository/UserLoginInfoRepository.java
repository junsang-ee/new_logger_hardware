package com.logger.web.repository;

import com.logger.web.model.entity.UserLoginInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginInfoRepository extends JpaRepository<UserLoginInfoEntity, String> {
}
