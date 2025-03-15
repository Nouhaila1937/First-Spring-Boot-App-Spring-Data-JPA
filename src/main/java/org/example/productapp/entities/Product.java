package org.example.productapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
//c'est du lombook il va ajouter des setters et des getters auto sans les faires
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //c'est autoincrement
   private Long id;
   private String name;
   private Double price;
   private int quantity;
    // Constructeur sans l'ID
    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
