//package com.example.sitelast.controllers;
//
//import com.example.sitelast.entity.TypeProduct;
//import com.example.sitelast.services.TypeProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class TypeProductController {
//    @Autowired
//    private TypeProductService typeProductService;
//
//    @GetMapping(value = "/typeProduct")
//    public List<TypeProduct> getAllTypeProduct() {
//        return typeProductService.getAllTypeProduct();
//    }
//    @PostMapping("/typeProduct")
//    public void createTypeProduct(@RequestBody TypeProduct typeProduct) {
//        typeProductService.createTypeProduct(typeProduct);
//    }
//    @DeleteMapping(value = "/typeProduct")
//    public void deleteTypeProduct(@RequestBody TypeProduct typeProduct) {
//        typeProductService.deleteTypeProduct(typeProduct);
//    }
//}