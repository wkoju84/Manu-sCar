package com.william.manuscar.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "images")
public class Image implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String url;
}
