package com.william.manuscar.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private Set<Booking> bookings;

    public Customer() {
    }

    public Customer(Long id, String name, String lastName, User user, Set<Booking> bookings) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.user = user;
        this.bookings = bookings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " id= " + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", user=" + user +
                ", bookings=" + bookings +
                '}';
    }
}
