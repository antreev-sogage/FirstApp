package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleController {
    @GetMapping
    public String Testing() {
        log.info("API Executed !!!");
        return "Hello Jack! Welcome back to GCP !!!!";
    }
}
