package com.example.ticketone.controller;

import com.example.ticketone.dto.EsameDto;
import com.example.ticketone.model.Esame;
import com.example.ticketone.model.Studente;
import com.example.ticketone.service.UniversitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "universita")
public class UniversitaController {

    @Autowired
    private UniversitaService service;

    @GetMapping(value = "getAllStudenti")
    public ResponseEntity<?> getAllStudenti(){
        /*
        List<Studente> out = service.getAllStudenti(); */
        return ResponseEntity.ok(service.getAllStudenti());
    }

    @GetMapping(value = "getStudenteById/{idStud}")
    public ResponseEntity<?> getStudenteById(@PathVariable(name = "idStud") Integer aaaa){
        /*
        List<Studente> out = service.getAllStudenti(); */
        return ResponseEntity.ok(service.getStudenteById(aaaa));
    }
    @PostMapping(value = "faiEsame/{idStudente}")
    public ResponseEntity<?> faiEsame(@RequestBody EsameDto esame, @PathVariable(name = "idStudente") Integer idStudente){
        return ResponseEntity.ok(service.faiEsame(esame, idStudente));
    }


}
