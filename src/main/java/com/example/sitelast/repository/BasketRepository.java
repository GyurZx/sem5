package com.example.sitelast.repository;

import com.example.sitelast.entity.Basket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BasketRepository extends CrudRepository<Basket, Long> {
    @Query("SELECT p FROM Basket p WHERE p.prod = :prod")
    Basket findOneByNameprod(@Param("prod") String prod);

    @Query("SELECT p FROM Basket p WHERE p.id_prod = :id_prod")
    Basket findByProductId(@Param("id_prod") Long id_prod);

    @Query("SELECT b.id_prod FROM Basket b")
    List<Long> findAllProductIdsBasket();

    List<Basket> findAll();
    void deleteById(Long id);
}
