package com.example.demo.controller;

import com.example.demo.model.Inscripcion;
import com.example.demo.service.InscripcionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/inscripciones")
public class InscripcionController {

    private final InscripcionService inscripcionService;

    public InscripcionController(InscripcionService inscripcionService) {
        this.inscripcionService = inscripcionService;
    }

    @GetMapping
    public List<Inscripcion> getAll() {
        return inscripcionService.findAll();
    }

    @PostMapping
    public Inscripcion create(@RequestBody Inscripcion inscripcion) {
        return inscripcionService.save(inscripcion);
    }
}
