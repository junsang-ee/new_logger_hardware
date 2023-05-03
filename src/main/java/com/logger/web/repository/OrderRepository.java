package com.logger.web.repository;

import com.logger.web.model.entity.OrderInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderInfoEntity, String> {
}
