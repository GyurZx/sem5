package com.example.sitelast.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "basket")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String prod, category, link; // quantity
    private int price;
    private Long id_prod;

    public Long getID(){return id;}
    public String getName(){return prod;}
    public String getCategory(){return category;}
    public int getPrice(){return price;}

    public Basket(Long id_prod, String prod, String category, int price, String link) {
        this.id_prod = id_prod;
        this.prod = prod;
        this.category = category;
        this.price = price;
        this.link = link;
        //this.quantity = quantity;
    }

    public Long getIdProd() {
        return id_prod;
    }
}
