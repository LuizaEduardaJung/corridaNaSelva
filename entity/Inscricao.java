package com.example.corridanaselva.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inscricao {
    @Id
    private int id;

    private double valorInscricao;

    @ManyToOne
    @JoinColumn(name = "circuito_id")
    private Circuito circuito;

    @ManyToOne
    @JoinColumn(name = "maratona_id")
    private Maratona maratona;

    @ManyToOne
    @JoinColumn(name = "maratonista_id")
    private Maratonista maratonista;


}
