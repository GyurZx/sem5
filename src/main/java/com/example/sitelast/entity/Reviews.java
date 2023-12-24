//package com.example.sitelast.entity;
//import jakarta.persistence.*;
//import lombok.*;
//
//@Data
//@AllArgsConstructor
//@Builder
//@Entity
//@Table(name = "reviews")
//public class Reviews {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id_rev;
//    @Getter
//    private String product, comment;
//    private int score;
//    public Long getId_rew() {return id_rev;}
//    public void setId_rew(Long id_rew) {this.id_rev = id_rew;}
//
//    public void setProduct(String product) {this.product = product;}
//    public String getComment() {return comment;}
//    public void setComment(String comment) {this.comment = comment;}
//    public int getScore() {return score;}
//    public void setScore(int score) {this.score = score;}
//    public Reviews(){}
//    public Reviews(String product, String comment, int score) {
//        this.product = product;
//        this.comment = comment;
//        this.score = score;
//    }
//}