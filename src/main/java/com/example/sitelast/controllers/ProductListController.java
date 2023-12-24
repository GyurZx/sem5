//package com.example.sitelast.controllers;
//
//import com.example.sitelast.entity.Product;
//import com.example.sitelast.services.ProductListService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ProductListController {
//    @Autowired
//    private ProductListService productListService;
//
//    @GetMapping(value = "/productList")
//    public List<Product> getAllProductLists() {
//        return productListService.getAllProductLists();
//    }
//
//    @PostMapping("/productList")
//    public void createProductList(@RequestBody Product productList) {
//        productListService.createProductList(productList);
//    }
//
//    @DeleteMapping("/productList")
//    public void deleteProductList(@RequestBody Product productList) {
//        productListService.deleteProductList(productList);
//    }
//}
