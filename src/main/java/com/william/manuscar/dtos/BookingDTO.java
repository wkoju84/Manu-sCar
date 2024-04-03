package com.william.manuscar.dtos;

import com.william.manuscar.entities.Booking;
import com.william.manuscar.entities.Customer;
import com.william.manuscar.entities.Product;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Date;

public class BookingDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Date pickUpDate;
    private Date dropOffDate;
    private Product product;
    private Customer customer;

    public BookingDTO() {
    }

    public BookingDTO(Long id, Date pickUpDate, Date dropOffDate, Product product, Customer customer) {
        this.id = id;
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
        this.product = product;
        this.customer = customer;
    }

    public BookingDTO(Booking entity) {
        this.id = entity.getId();
        this.pickUpDate = entity.getPickUpDate();
        this.dropOffDate = entity.getDropOffDate();
        //this.product = new ProductDTO(entity.getProduct());
        //this.customer = new CustomerDTO(entity.getCustomer().getId());
    }

}
