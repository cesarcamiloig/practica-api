package com.example.demo.controller;

import com.example.demo.model.Programacion;
import com.example.demo.service.ProgramacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/programaciones")
public class ProgramacionController {

    @Autowired
    private ProgramacionService programacionService;

    @GetMapping
    public List<Programacion> findAll() {
        return programacionService.findAll();
    }

    @PostMapping
    public Programacion save(@RequestBody Programacion programacion) {
        return programacionService.save(programacion);
    }
}