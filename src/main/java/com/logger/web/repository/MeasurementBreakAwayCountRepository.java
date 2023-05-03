package com.logger.web.repository;

import com.logger.web.model.entity.MeasurementBreakAwayCountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementBreakAwayCountRepository extends JpaRepository<MeasurementBreakAwayCountEntity, String> {
}
