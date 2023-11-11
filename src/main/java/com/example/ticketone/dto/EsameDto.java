package com.example.ticketone.dto;

import com.example.ticketone.model.Studente;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Data
public class EsameDto {

    private Integer id;

    private Integer cfu;

    private String nome;

    private String dataCreazione;

    private Boolean isObbligatorio;

}
