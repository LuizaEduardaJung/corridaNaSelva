package com.example.corridanaselva.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maratonista {
    @Id
    private Long id;
    private String nome;
    private String sobrenome;
    private int idade;
    private String grupoSanguineo;
    private String numeroCelular;
    private String numeroEmergencia;
    private String rg;

    @OneToMany(mappedBy = "maratonista")
    private List<Inscricao> inscricaos;


}
