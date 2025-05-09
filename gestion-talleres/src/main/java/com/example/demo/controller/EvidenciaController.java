package com.example.demo.controller;

import com.example.demo.model.Evidencia;
import com.example.demo.service.EvidenciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/evidencias")
public class EvidenciaController {

    private final EvidenciaService evidenciaService;

    public EvidenciaController(EvidenciaService evidenciaService) {
        this.evidenciaService = evidenciaService;
    }

    @GetMapping
    public List<Evidencia> getAll() {
        return evidenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Evidencia> getById(@PathVariable Integer id) {
        return evidenciaService.findById(id);
    }

    @PostMapping
    public Evidencia create(@RequestBody Evidencia evidencia) {
        return evidenciaService.save(evidencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        evidenciaService.deleteById(id);
    }
}
