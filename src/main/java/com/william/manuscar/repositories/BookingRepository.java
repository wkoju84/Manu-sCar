package com.william.manuscar.repositories;

import com.william.manuscar.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query("select b from Booking b where b.product.id = ?1")
    List<Booking> findAllByProductId(Long productId);

    @Query("select b from Booking b where b.customer.id = ?1")
    List<Booking> findAllByCustomerId(Long customerId);
}
