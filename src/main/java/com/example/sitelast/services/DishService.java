//package com.example.sitelast.services;
//
////import com.example.spring.entity.Car;
////import com.example.spring.entity.SearchRequest;
////import com.example.spring.repository.CarsRepository;
//import com.example.sitelast.entity.Dish;
//import com.example.sitelast.repository.DishRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//// Чтобы спринг видил, какой это класс
//@Service
//public class DishService {
//
//    //Спринг создает репозиторий
//    @Autowired
//    private DishRepository dishRepository;
//
//    public void createDish(Dish dish) {
//        dishRepository.save(dish);
//    }
//
//    public List<Dish> getAllDish() {
//        return dishRepository.findAll();
//    }
//
//    public void deleteDish(Dish dish) {
//        dishRepository.delete(dish);
//    }
//}
