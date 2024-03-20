package com.william.manuscar.controllers;

import com.william.manuscar.dtos.FeatureDTO;
import com.william.manuscar.services.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/features")
public class FeatureController {

    @Autowired
    private FeatureService featureService;

    @GetMapping
    public ResponseEntity<List<FeatureDTO>> searchAllFeatures(){
        List<FeatureDTO> list = featureService.searchAll();
        return ResponseEntity.ok().body(list);
    }
}
