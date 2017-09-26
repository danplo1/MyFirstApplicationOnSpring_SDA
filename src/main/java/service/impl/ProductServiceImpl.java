package service.impl;


import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl  {
    @Autowired
    private ProductRepository productRepository;


    //@Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    //@Override
    public Product findOne(Long id) {
        return productRepository.findOne(id);
    }

    //@Override
    public Product create(Product product) {
        return productRepository.save(product);
    }
}
