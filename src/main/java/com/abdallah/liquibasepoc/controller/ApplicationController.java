package com.abdallah.liquibasepoc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/info")
public class ApplicationController {

    @GetMapping
    ResponseEntity<Map<String, String>> getApplicationInfo(){

        var applicationInfo = Map.of(
                "name", "liquibase POC",
                "version","1.0.0",
                "language","en/ar",
                "path","liquibase.app/api/v1/"
        );
        return ResponseEntity.ok(applicationInfo);
    }
}
