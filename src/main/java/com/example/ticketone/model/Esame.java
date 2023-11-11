package com.example.ticketone.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "esame")
@Data
public class Esame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer cfu;

    private String nome;

    @OneToMany(mappedBy = "esame")
    private List<Studente> studenti;

}
