package com.william.manuscar.dtos;

import com.william.manuscar.entities.Feature;
import com.william.manuscar.entities.Image;
import com.william.manuscar.entities.Product;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String description;

    private Set<FeatureDTO> features = new HashSet<>();

    private CategoryDTO category;

    private CityDTO city;

    private Set<ImageDTO> images = new HashSet<>();

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Set<FeatureDTO> features, CategoryDTO category,
                      CityDTO city, Set<ImageDTO> images) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.features = features;
        this.category = category;
        this.city = city;
        this.images = images;
    }

    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.features = toFeaturesDTO(entity.getFeatures());
        this.category = new CategoryDTO(entity.getCategory());
        this.city = new CityDTO(entity.getCity());
        this.images = toImagesDTO(entity.getImages());
    }

    private Set<FeatureDTO> toFeaturesDTO(Set<Feature> features){
        Set<FeatureDTO> result = new HashSet<>();
        for (Feature feature : features){
            result.add(new FeatureDTO(feature));
        }
        return result;
    }

    private Set<ImageDTO> toImagesDTO(Set<Image> images) {
        Set<ImageDTO> result = new HashSet<>();
        for (Image image: images) {
            result.add(new ImageDTO(image));
        }
        return result;
    }

}
