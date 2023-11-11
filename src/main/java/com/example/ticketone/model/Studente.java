package com.example.ticketone.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "studente")
@Data
public class Studente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String cognome;

    @Column(name = "media_voti")
    private Integer mediaVoti;

    @ManyToOne()
    @JoinColumn(name = "fk_relatore")
    private Relatore relatore;

    @OneToMany(mappedBy = "studente")
    private List<StudenteEsame> esameList;
}
