package com.example.sitelast.repository;
import com.example.sitelast.entity.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
public interface ProductsRepository extends CrudRepository<Products, Long> {
    @Query("SELECT p FROM Products p WHERE p.category = :category")
    Iterable<Products> findByCategory(@Param("category") String category);
    @Query("SELECT p FROM Products p WHERE p.name_prod = :name_prod")
    Products findOneByNameprod(@Param("name_prod") String name_prod);
}