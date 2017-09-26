package service;


import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findOne (Long Id);
    Product create (Product product);

}
