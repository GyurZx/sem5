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
//public class ProductListService {
//    @Autowired
//    private ProductRepository productListRepository;
//
//    public void createProductList(Product product) {
//        productListRepository.save(product);
//    }
//
//    public List<Product> getAllProductLists() {
//        return productListRepository.findAll();
//    }
//
//    public void deleteProductList(Product product) {
//        productListRepository.delete(product);
//    }
//
//}
