package com.example.ticketone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "studente_esame")
@Data
public class StudenteEsame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_esame")
    @JsonIgnore
    private Esame esame;

    @ManyToOne
    @JoinColumn(name = "fk_studente")
    @JsonIgnore
    private Studente studente;

}
