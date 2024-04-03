package com.william.manuscar.dtos;

import com.william.manuscar.entities.Customer;
import com.william.manuscar.entities.User;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String lastName;
    private User user;

    public CustomerDTO(Long id) {
        this.id = id;
    }

    public CustomerDTO(Long id, String name, String lastName, User user) {
        this.id = id;
        if (name != null){

            this.name = name.trim();
        }

        if (lastName != null){

            this.lastName = lastName.trim();
        }

        this.user = user;
    }

    public CustomerDTO (Customer entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.lastName = entity.getLastName();

        if (entity.getUser() != null){
            this.user = new User();//Alterar para UserDTO futuramente
        }
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
}
