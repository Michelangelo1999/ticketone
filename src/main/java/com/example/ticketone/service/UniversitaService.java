package com.example.ticketone.service;

import com.example.ticketone.model.Relatore;
import com.example.ticketone.model.Studente;
import com.example.ticketone.repo.EsameRepository;
import com.example.ticketone.repo.StudenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UniversitaService {

    @Autowired
    private EsameRepository esameRepository;

    @Autowired
    private StudenteRepository studenteRepository;

    private Integer faiEsame(){

        Relatore caio = new Relatore();

        return 18;
    }

    public List<Studente> getAllStudenti(){
        /*
        List<Studente> studenteList = new ArrayList<>();
        studenteList = studenteRepository.findAll();
        return studenteList;
        */
         return studenteRepository.findAll();
    }

    public Studente getStudenteById(Integer id){
        Optional<Studente> opt = studenteRepository.findById(id);
        if(opt.isPresent()){
            return opt.get();
        } else {
            return null;
        }
    }

}
