package com.example.corridanaselva.controller;

import com.example.corridanaselva.entity.Maratonista;
import com.example.corridanaselva.service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("maratonista")
public class MaratonistaController {
    private final MaratonistaService maratonistaService;

    public MaratonistaController(MaratonistaService maratonistaService) {
        this.maratonistaService = maratonistaService;
    }

    @PostMapping("salvar")
    public ResponseEntity<Maratonista> salvarMaratonista(@RequestBody Maratonista maratonista) {
        Maratonista novoMaratonista = maratonistaService.salvarMaratonista(maratonista);
        return ResponseEntity.ok(novoMaratonista);
    }

    @GetMapping("buscar")
    public ResponseEntity<List<Maratonista>> obterTodosMaratonistas() {
        List<Maratonista> maratonistas = maratonistaService.obterTodosMaratonistas();
        return ResponseEntity.ok(maratonistas);
    }

    @GetMapping("buscar/{id}")
    public ResponseEntity<Maratonista> obterMaratonistaPorId(@PathVariable Long id) {
        Maratonista maratonista = maratonistaService.obterMaratonistaPorId(id);
        return ResponseEntity.ok(maratonista);
    }

    // outros métodos do controlador, se necessário
}

