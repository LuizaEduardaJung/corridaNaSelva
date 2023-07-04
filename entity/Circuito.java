package com.example.corridanaselva.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circuito {
    @Id
    private Long id;
    private int distancia;
    public Categoria categoria;

    public enum Categoria {
        PEQUENO, MEDIO, AVANCADO;
    }

    @ManyToOne
    @JoinColumn(name = "maratona_id")
    private Maratona maratona;

}



