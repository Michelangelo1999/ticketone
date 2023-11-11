package com.example.ticketone.service;

import com.example.ticketone.dto.EsameDto;
import com.example.ticketone.model.Esame;
import com.example.ticketone.model.Relatore;
import com.example.ticketone.model.Studente;
import com.example.ticketone.model.StudenteEsame;
import com.example.ticketone.repo.EsameRepository;
import com.example.ticketone.repo.StudenteEsameRepository;
import com.example.ticketone.repo.StudenteRepository;
import com.example.ticketone.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UniversitaService {

    @Autowired
    private EsameRepository esameRepository;

    @Autowired
    private StudenteRepository studenteRepository;
    @Autowired
    private StudenteEsameRepository studenteEsameRepository;

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

    public EsameDto faiEsame(EsameDto e, Integer idStudente){
        //e = esameRepository.save(e);
        Esame model = converter(e);
        model = esameRepository.save(model);
        creaStudenteEsame(model, idStudente);
        e.setId(model.getId());
        return e;
    }

    private Esame converter(EsameDto dto){
        Esame esame = new Esame();
        esame.setId(dto.getId());
        esame.setNome(dto.getNome());
        esame.setCfu(dto.getCfu());
        esame.setDataCreazione(LocalDate.parse(dto.getDataCreazione(), Utils.FORMATTER));
        return esame;
    }

    private void creaStudenteEsame(Esame model, Integer idStudente){
        StudenteEsame se = new StudenteEsame();
        se.setEsame(model);
        Studente s = studenteRepository.findById(idStudente).get();
        se.setStudente(s);
        studenteEsameRepository.save(se);
    }


}
