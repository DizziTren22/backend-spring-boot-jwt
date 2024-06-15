package com.example.proyectobackendspringboot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EntityController {

    @GetMapping("/search")
    public ResponseEntity<Object> getEntity() {
        return ResponseEntity.ok("getEntity");
    }
}
