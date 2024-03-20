package com.william.manuscar.services;

import com.william.manuscar.dtos.FeatureDTO;
import com.william.manuscar.entities.Feature;
import com.william.manuscar.repositories.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeatureService {

    @Autowired
    private FeatureRepository featureRepository;

    @Transactional(readOnly = true)
    public List<FeatureDTO> searchAll(){
        List<Feature> list = featureRepository.findAll();
        return list.stream().map(FeatureDTO::new).collect(Collectors.toList());
    }
}
