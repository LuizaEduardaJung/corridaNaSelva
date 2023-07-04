package com.example.corridanaselva.service;

import com.example.corridanaselva.entity.Circuito;
import com.example.corridanaselva.entity.Inscricao;
import com.example.corridanaselva.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class InscricaoService {
    private final InscricaoRepository inscricaoRepository;

    @Autowired
    public InscricaoService(InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository = inscricaoRepository;
    }

    public List<Inscricao> buscarInscricoes() {
        return inscricaoRepository.findAll();
    }

    public Inscricao buscarInscricaoPorId(int id) {
        Optional<Inscricao> optionalInscricao = inscricaoRepository.findById(id);
        return optionalInscricao.orElse(null);
    }

    public double salvarInscricao(Inscricao inscricao) {
        int idade = inscricao.getMaratonista().getIdade();
        double valorInscricao;
        Circuito.Categoria categoria = null;
        if (categoria == Circuito.Categoria.PEQUENO) {
            if (idade < 18) {
                valorInscricao = 1300;
            } else {
                valorInscricao = 1500;
            }
        } else if (categoria == Circuito.Categoria.MEDIO) {
            if (idade < 18) {
                valorInscricao = 2000;
            } else {
                valorInscricao = 2300;
            }
        } else if (categoria == Circuito.Categoria.AVANCADO) {
            if (idade < 18) {
                throw new IllegalArgumentException("Inscrição não permitida para menores de 18 anos");
            } else {
                valorInscricao = 2800;
            }
        } else {
            throw new IllegalArgumentException("Categoria inválida");
        }

        return valorInscricao;
    }


    }




