//package com.example.sitelast.controllers;
//
//import com.example.sitelast.entity.Dish;
//import com.example.sitelast.services.DishService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class DishController {
//    @Autowired
//    private DishService dishService;
//
//    @GetMapping(value = "/dish")
//    public List<Dish> getAllDish() {
//        return dishService.getAllDish();
//    }
//    @PostMapping("/dish")
//    public void createDish(@RequestBody Dish dish) {
//        dishService.createDish(dish);
//    }
//    @DeleteMapping(value = "/dish")
//    public void deleteUser(@RequestBody Dish dish) {
//        dishService.deleteDish(dish);
//    }
//}