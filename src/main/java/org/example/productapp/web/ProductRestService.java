package org.example.productapp.web;



import org.example.productapp.entities.Product;
import org.example.productapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product> products() {
        return productRepository.findAll();
    }
}
