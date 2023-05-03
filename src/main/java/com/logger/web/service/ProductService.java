package com.logger.web.service;

import com.logger.web.model.dto.request.ProductSaveRequest;
import com.logger.web.model.entity.ProductEntity;

public interface ProductService {
    ProductEntity save(ProductSaveRequest productSaveRequest);
}
