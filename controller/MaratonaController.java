package com.example.corridanaselva.controller;

import com.example.corridanaselva.entity.Maratona;
import com.example.corridanaselva.service.MaratonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/maratonas")
public class MaratonaController {

    private final MaratonaService maratonaService;

    @Autowired
    public MaratonaController(MaratonaService maratonaService) {
        this.maratonaService = maratonaService;
    }

    @PostMapping("salvar")
    public ResponseEntity<Maratona> salvarMaratona(@RequestBody Maratona maratona) {
        Maratona novaMaratona = maratonaService.salvarMaratona(maratona);
        return new ResponseEntity<>(novaMaratona, HttpStatus.CREATED);
    }

    @GetMapping("buscar/{id}")
    public ResponseEntity<Optional<Maratona>> buscarMaratonaPorId(@PathVariable Long id) {
        Optional<Maratona> maratona = maratonaService.buscarMaratonaPorId(id);
        return ResponseEntity.ok(maratona);
    }

    @GetMapping("maratonas")
    public ResponseEntity<List<Maratona>> buscarTodasMaratonas() {
        List<Maratona> maratonas = maratonaService.buscarTodasMaratonas();
        return ResponseEntity.ok(maratonas);
    }
}

