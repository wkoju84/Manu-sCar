package com.william.manuscar.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "cities")
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
}
