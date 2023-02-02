package com.example.incrementservice.controller;

import com.example.incrementservice.api.IncrementApi;
import com.example.incrementservice.service.IncrementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncrementController implements IncrementApi {

    IncrementService incrementService = new IncrementService();
    @Override
    public ResponseEntity<Integer> incrementTheNumber(Integer givenNumber, Integer incrementer) {

        int response = incrementService.add(givenNumber, incrementer);
        return new ResponseEntity<Integer>(response, HttpStatus.OK);
    }
}
