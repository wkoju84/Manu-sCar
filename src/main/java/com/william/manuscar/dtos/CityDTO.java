package com.william.manuscar.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.william.manuscar.entities.City;
import com.william.manuscar.entities.Product;

import java.io.Serializable;
import java.util.List;

public class CityDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String country;

    @JsonIgnore
    private List<Product> products;

    public CityDTO() {
    }

    public CityDTO(Long id, String name, String country, List<Product> products) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.products = products;
    }

    public CityDTO(City entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.country = entity.getCountry();
        this.products = entity.getProducts();
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "CityDTO{" +
                "id= " + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", products=" + products +
                '}';
    }
}
