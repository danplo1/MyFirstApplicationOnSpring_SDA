package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findByOne(@PathVariable("id") Long id) {
        return productService.findOne(id);
    }

    @PutMapping("/create")
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }
}