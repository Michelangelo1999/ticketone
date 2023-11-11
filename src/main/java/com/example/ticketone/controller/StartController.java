package com.example.ticketone.controller;

import com.example.ticketone.service.BigliettiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "start")
public class StartController {

    @Autowired
    private BigliettiService bigliettiService;

    @GetMapping
    public ResponseEntity<?> start(){
        Object res = bigliettiService.getBiglietti();
        if(res != null){
            return ResponseEntity.ok(res);
        } else{
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping(value = "alt")
    public ResponseEntity<?> startAlternativo(){
        Object res = bigliettiService.getBigliettiAlt();
        if(res != null){
            return ResponseEntity.ok(res);
        } else{
            return ResponseEntity.noContent().build();
        }
    }
}
