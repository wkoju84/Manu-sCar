package com.william.manuscar.repositories;

import com.william.manuscar.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
     @Query("select p from Product p where p.category.id = ?1")
     List<Product> findAllByCategoryId(Long categoryId);

    @Query("select p from Product p where p.city.id = ?1")
    List<Product> findAllByCityId(Long cityId);

    @Query(value = "SELECT p.* FROM products p WHERE NOT EXISTS (SELECT 1 FROM bookings b WHERE b.product_id = p.id AND b.pickup_date >= :pickupDate AND b.dropoff_date <= :dropoffDate)", nativeQuery = true)
    List<Product> findAllByDateRange(@Param("pickUpDate") Date pickUpDate, @Param("dropOffDate") Date dropOffDate);

    @Query(value = "SELECT p.* FROM products p WHERE NOT EXISTS (SELECT 1 FROM bookings b WHERE b.product_id = p.id AND b.pickup_date >= :pickupDate AND b.dropoff_date <= :dropoffDate) AND p.city_id = :cityId", nativeQuery = true)
    List<Product> findAllByCityIdAndDateRange(@Param("cityId") Long cityId, @Param("pickUpDate") Date pickUpDate, @Param("dropOffDate") Date dropOffDate);

}
