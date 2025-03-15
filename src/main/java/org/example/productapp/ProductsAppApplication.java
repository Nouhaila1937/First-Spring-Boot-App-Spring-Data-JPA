package org.example.productapp;

import org.example.productapp.entities.Product;
import org.example.productapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsAppApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {

		SpringApplication.run(ProductsAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	productRepository.save(new Product(null,"Computer",43000.0,2));
	productRepository.save(new Product(null,"Printer",4300.0,20));
	productRepository.save(new Product(null,"Phone",7300.0,10));
	}
}
