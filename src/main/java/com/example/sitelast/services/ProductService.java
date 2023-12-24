//package com.example.sitelast.services;
//
//import com.example.sitelast.entity.Product;
//import com.example.sitelast.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//    @Autowired
//    private ProductRepository productRepository;
//
//    public void createProduct(Product product) {
//        productRepository.save(product);
//    }
//
//    public List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    public void deleteProduct(Product product) {
//        productRepository.delete(product);
//    }
//}
