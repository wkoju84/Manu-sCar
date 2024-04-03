package com.william.manuscar.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.william.manuscar.entities.User;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private RoleDTO role;

    public UserDTO() {
    }

    public UserDTO(Long id, String email, String password, RoleDTO role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.email = entity.getEmail();
        this.password = entity.getPassword();

        if (entity.getRole() != null){

            this.role = new RoleDTO();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }
}
