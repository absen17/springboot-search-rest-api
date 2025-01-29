package com.abs.springboot.services.impl;

import com.abs.springboot.entity.Product;
import com.abs.springboot.repository.ProductRepository;
import com.abs.springboot.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    /*
    Constructor based dependency injection. Spring will automatically add
    @Autowired when it finds only one constructor for this class
    */
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {

        List<Product> products =productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
