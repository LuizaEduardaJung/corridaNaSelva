package com.example.corridanaselva.service;

import com.example.corridanaselva.entity.Circuito;
import com.example.corridanaselva.repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CircuitoService {

    private final CircuitoRepository circuitoRepository;

    @Autowired
    public CircuitoService(CircuitoRepository circuitoRepository) {
        this.circuitoRepository = circuitoRepository;
    }

    public Circuito salvarCircuito(Circuito circuito) {
        return circuitoRepository.save(circuito);
    }

    public Optional<Circuito> buscarCircuitoPorId(Long id) {
        return circuitoRepository.findById(id);
    }

    public List<Circuito> buscarTodosCircuitos() {
        return circuitoRepository.findAll();
    }

}
