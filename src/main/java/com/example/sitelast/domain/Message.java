//package com.example.sitelast.domain;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//public class Message {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Integer id;
//    @Column(name = "text", nullable = true)
//    private String text;
//    @Column(name = "tag", nullable = true)
//    private String tag;
//
//    public Message(String text, String tag) {
//        this.text = text;
//        this.tag = tag;
//    }
//}
