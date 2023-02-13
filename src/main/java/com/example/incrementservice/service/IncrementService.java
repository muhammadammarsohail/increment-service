package com.example.incrementservice.service;
//import java.util.logging.Logger;


//import lombok.extern.slf4j.Slf4j;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class IncrementService {
//    private static final Logger log = LoggerFactory.getLogger(IncrementService.class);
//    private static final Logger log = Logger.getLogger(IncrementService.class.getName());
    public int add(int first, int second) {
        log.info("Welcome to the log");
        return first + second;
    }
}
