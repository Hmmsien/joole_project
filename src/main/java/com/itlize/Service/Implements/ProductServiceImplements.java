package com.itlize.Service.Implements;


import com.itlize.Entity.Product;
import com.itlize.Repository.ProductRepository;
import com.itlize.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplements implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
