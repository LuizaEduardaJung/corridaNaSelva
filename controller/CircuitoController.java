package com.example.corridanaselva.controller;

import com.example.corridanaselva.entity.Circuito;
import com.example.corridanaselva.service.CircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("circuitos")
public class CircuitoController {
    private final CircuitoService circuitoService;

    @Autowired
    public CircuitoController(CircuitoService circuitoService) {
        this.circuitoService = circuitoService;
    }

    @PostMapping("salvar")
    public ResponseEntity<Circuito> salvarCircuito(@RequestBody Circuito circuito) {
        Circuito novoCircuito = circuitoService.salvarCircuito(circuito);
        return new ResponseEntity<>(novoCircuito, HttpStatus.CREATED);
    }

    @GetMapping("circuito/{id}")
    public ResponseEntity<Optional<Circuito>> buscarCircuitoPorId(@PathVariable Long id) {
        Optional<Circuito> circuito = circuitoService.buscarCircuitoPorId(id);
        return ResponseEntity.ok(circuito);
    }

    @GetMapping("circuitos")
    public ResponseEntity<List<Circuito>> buscarTodosCircuitos() {
        List<Circuito> circuitos = circuitoService.buscarTodosCircuitos();
        return ResponseEntity.ok(circuitos);
    }
}
