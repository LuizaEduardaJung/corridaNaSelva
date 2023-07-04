package com.example.corridanaselva.service;

import com.example.corridanaselva.entity.Maratona;
import com.example.corridanaselva.repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaratonaService {
    private final MaratonaRepository maratonaRepository;

    @Autowired
    public MaratonaService(MaratonaRepository maratonaRepository) {
        this.maratonaRepository = maratonaRepository;
    }

    public Maratona salvarMaratona(Maratona maratona) {
        return maratonaRepository.save(maratona);
    }

    public Optional<Maratona> buscarMaratonaPorId(Long id) {
        return maratonaRepository.findById(id);
    }

    public List<Maratona> buscarTodasMaratonas() {
        return maratonaRepository.findAll();
    }

}
