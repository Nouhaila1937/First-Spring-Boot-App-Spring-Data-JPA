package org.example.productapp.repository;

import org.example.productapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //spring data pour ajouter des éléments dans le tableau products

    List<Product> findByNameContains(String name);

    @Query("select p from Product p where p.name like :x")
    List<Product> search(@Param("x") String name);

}
