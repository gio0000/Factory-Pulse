package com.giordana.factorypulse.controller;

import com.giordana.factorypulse.model.Producao;
import com.giordana.factorypulse.repository.ProducaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producao")
@CrossOrigin(origins = "*")
public class ProducaoController {

    private final ProducaoRepository repository;

    public ProducaoController(ProducaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Producao> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Producao cadastrar(@RequestBody Producao producao) {
        return repository.save(producao);
    }
}