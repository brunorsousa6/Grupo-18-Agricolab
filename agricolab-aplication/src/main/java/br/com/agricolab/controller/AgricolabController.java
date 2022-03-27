package br.com.agricolab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agricolab")
public class AgricolabController {

    @GetMapping
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("Hello World");
    }
    
}
