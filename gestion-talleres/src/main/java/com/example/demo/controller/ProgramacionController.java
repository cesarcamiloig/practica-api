package com.example.demo.controller;

import com.example.demo.model.Programacion;
import com.example.demo.service.ProgramacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programaciones")
public class ProgramacionController {

    private final ProgramacionService programacionService;

    public ProgramacionController(ProgramacionService programacionService) {
        this.programacionService = programacionService;
    }

    @GetMapping
    public List<Programacion> getAllProgramaciones() {
        return programacionService.findAll();
    }

    @PostMapping
    public Programacion createProgramacion(@RequestBody Programacion programacion) {
        return programacionService.save(programacion);
    }
}
