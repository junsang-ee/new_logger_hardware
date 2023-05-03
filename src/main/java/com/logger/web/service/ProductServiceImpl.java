package com.logger.web.service;

import com.logger.web.model.dto.request.ProductSaveRequest;
import com.logger.web.model.entity.ProductEntity;
import com.logger.web.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Transactional
    @Override
    public ProductEntity save(ProductSaveRequest productSaveRequest) {
        return productRepository.save(toSaveEntity(productSaveRequest));
    }

    private ProductEntity toSaveEntity(ProductSaveRequest productSaveRequest) {
        ProductEntity product = new ProductEntity();
        product.setName(productSaveRequest.getName());
        product.setCost(productSaveRequest.getCost());
        return product;
    }
}
