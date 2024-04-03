package com.william.manuscar.dtos;

import com.william.manuscar.entities.Category;

import java.io.Serializable;

public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;
    private Integer rating;
    private String description;
    private String url;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name, Integer rating, String description, String url) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.description = description;
        this.url = url;
    }

    public CategoryDTO(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.rating = entity.getRating();
        this.description = entity.getDescription();
        this.url = entity.getUrl();
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

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "id= " + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
