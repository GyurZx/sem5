package com.example.sitelast.repository;

import com.example.sitelast.entity.Basket;
import com.example.sitelast.entity.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
    List<Orders> findAll();
    @Query("SELECT p FROM Orders p WHERE p.id_prod = :id_prod")
    Orders findByProductId(@Param("id_prod") Long id_prod);

    @Query("SELECT o.id_prod FROM Orders o")
    List<Long> findAllProductIdsOrders();
}