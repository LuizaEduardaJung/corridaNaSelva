package com.example.corridanaselva.service;

import com.example.corridanaselva.entity.Inscricao;
import com.example.corridanaselva.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Inscricao salvarInscricao(Inscricao inscricao) {
        return inscricaoRepository.save(inscricao);
    }
}


