package com.example.corridanaselva.service;

import com.example.corridanaselva.entity.Maratonista;
import com.example.corridanaselva.repository.MaratonistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonistaService {
    private final MaratonistaRepository maratonistaRepository;

    public MaratonistaService(MaratonistaRepository maratonistaRepository) {
        this.maratonistaRepository = maratonistaRepository;
    }

    public Maratonista salvarMaratonista(Maratonista maratonista) {
        // adicione validações ou lógica de negócio antes de salvar o maratonista
        return maratonistaRepository.save(maratonista);
    }

    public List<Maratonista> obterTodosMaratonistas() {
        return maratonistaRepository.findAll();
    }

    public Maratonista obterMaratonistaPorId(Long id) {
        return maratonistaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Maratonista não encontrado com o ID: " + id));
    }
}


