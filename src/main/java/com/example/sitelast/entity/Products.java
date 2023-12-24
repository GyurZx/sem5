package com.example.sitelast.entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name_prod, category, link;
    private int price;

    public Long getID(){return id;}
    public String getName(){return name_prod;}
    public String getCategory(){return category;}
    public int getPrice(){return price;}
}