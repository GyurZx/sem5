//package com.example.sitelast.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
////Аннотация Data включает @Getter @Setter, HashCode toString RequiredArgsConstructor
//@Data
////Обязан принимать все аргументы
//@AllArgsConstructor
////Конструктор по умолчанию
//@NoArgsConstructor
////Для построения конструктора с несколькими значениеями
//@Builder
//@Entity
//@Table(name = "dishes")
//public class Dish {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Long id;
//    @Column(name = "description", nullable = false)
//    private String description;
//    @Column(name = "counter", nullable = false)
//    private int counter;
//    @Column(name = "shortDescription", nullable = false)
//    private String shortDescription;
//    @Column(name = "productList", nullable = true)
//    private String list;
//    @Column(name = "rating", nullable = true)
//    private String rating;
//}
