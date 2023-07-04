package com.example.corridanaselva.controller;

import com.example.corridanaselva.entity.Inscricao;
import com.example.corridanaselva.service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {

    private final InscricaoService inscricaoService;

    @Autowired
    public InscricaoController(InscricaoService inscricaoService) {
        this.inscricaoService = inscricaoService;
    }

    @GetMapping("inscricoes")
    public List<Inscricao> buscarTodasInscricoes() {
        return inscricaoService.buscarInscricoes();
    }

    @GetMapping("/inscricao/{id}")
    public Inscricao buscarInscricaoPorId(@PathVariable int id) {
        return inscricaoService.buscarInscricaoPorId(id);
    }

    @PostMapping("salvar")
    public Inscricao salvarInscricao(@RequestBody Inscricao inscricao) {
        return inscricaoService.salvarInscricao(inscricao);
    }
}
