//package com.example.sitelast.controllers;
//
//import com.example.sitelast.entity.Product;
//import com.example.sitelast.services.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ProductController {
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping(value = "/product")
//    public List<Product> getAllProduct() {
//        return productService.getAllProducts();
//    }
//
//    @PostMapping("/product")
//    public void createProduct(@RequestBody Product product) {
//        productService.createProduct(product);
//    }
//
//    @DeleteMapping("/product")
//    public void deleteProduct(@RequestBody Product product) {
//        productService.deleteProduct(product);
//    }
//}
