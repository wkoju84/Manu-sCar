package com.william.manuscar.repositories;

import com.william.manuscar.entities.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeatureRepository extends JpaRepository<Feature, Long> {

    List<Feature> findByIdIn(List<Long> featureIdList);
}
