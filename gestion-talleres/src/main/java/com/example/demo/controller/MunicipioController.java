package com.example.demo.controller;

import com.example.demo.model.Municipio;
import com.example.demo.service.MunicipioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/municipios")
public class MunicipioController {

    private final MunicipioService municipioService;

    public MunicipioController(MunicipioService municipioService) {
        this.municipioService = municipioService;
    }

    @GetMapping
    public List<Municipio> getAll() {
        return municipioService.findAll();
    }

    @PostMapping
    public Municipio create(@RequestBody Municipio municipio) {
        return municipioService.save(municipio);
    }
}
