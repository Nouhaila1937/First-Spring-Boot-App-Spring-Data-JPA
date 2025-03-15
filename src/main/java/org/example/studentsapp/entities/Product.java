package org.example.studentsapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data //c'est du lombook il va ajouter des setters et des getters auto sans les faires

public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //c'est autoincrement
   private Long id;
   private String name;
   private Double price;
   private int quantity;
}
