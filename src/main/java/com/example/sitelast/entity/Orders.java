package com.example.sitelast.entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String state, address, link, prod;
    private int price;
    private Long id_prod;

    public Long getId() {return id;}
    public String getState() {return state;}
    public String getAddress() {return address;}
    public void setId(Long id_pord) {this.id = id_pord;}
    public void setState(String product) {this.state = product;}
    public void setAddress(String address) {this.address = address;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public Orders(){}
    public Orders(Long id_prod, String state, String address, int price, String prod, String link) {
        this.id_prod = id_prod;
        this.state = state;
        this.address = address;
        this.price = price;
        this.link = link;
        this.prod = prod;
    }
}