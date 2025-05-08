package com.example.demo.controller;

import com.example.demo.model.Colegio;
import com.example.demo.service.ColegioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colegios")
public class ColegioController {

    private final ColegioService colegioService;

    public ColegioController(ColegioService colegioService) {
        this.colegioService = colegioService;
    }

    @GetMapping
    public List<Colegio> getAllColegios() {
        return colegioService.findAll();
    }

    @PostMapping
    public Colegio createColegio(@RequestBody Colegio colegio) {
        return colegioService.save(colegio);
    }
}
