package com.william.manuscar.dtos;

import com.william.manuscar.entities.Feature;

import java.io.Serializable;

public class FeatureDTO implements Serializable {

    public static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String icon;

    public FeatureDTO() {
    }

    public FeatureDTO(Long id, String name, String icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }

    public FeatureDTO(Feature entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.icon = entity.getIcon();
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "FeatureDTO { " +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", icon= '" + icon + '\'' +
                '}';
    }
}
