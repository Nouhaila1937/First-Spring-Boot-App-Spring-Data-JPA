package org.example.productapp.repository;

import org.example.productapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //spring data pour ajouter des éléments dans le tableau products

    List<Product> findByIdContains(Long id);
}
