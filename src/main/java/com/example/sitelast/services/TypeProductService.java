//package com.example.sitelast.services;
//
//import com.example.sitelast.entity.TypeProduct;
//import com.example.sitelast.repository.TypeProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//// Чтобы спринг видил, какой это класс
//@Service
//public class TypeProductService {
//
//    //Спринг создает репозиторий
//    @Autowired
//    private TypeProductRepository typeProductRepository;
//
//    public void createTypeProduct(TypeProduct typeProduct) {
//        typeProductRepository.save(typeProduct);
//    }
//    public List<TypeProduct> getAllTypeProduct() {
//        return typeProductRepository.findAll();
//    }
//
//    public void deleteTypeProduct(TypeProduct typeProduct) {
//        typeProductRepository.delete(typeProduct);
//    }
//}
