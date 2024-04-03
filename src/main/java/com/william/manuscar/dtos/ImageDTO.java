package com.william.manuscar.dtos;

import com.william.manuscar.entities.Image;

import java.io.Serializable;

public class ImageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String title;
    private String url;

    public ImageDTO() {
    }

    public ImageDTO(Long id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }

    public ImageDTO(Image entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.url = entity.getUrl();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
