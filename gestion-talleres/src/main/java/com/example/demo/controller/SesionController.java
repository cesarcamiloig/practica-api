package com.example.demo.controller;

import com.example.demo.model.Sesion;
import com.example.demo.service.SesionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sesiones")
public class SesionController {

    private final SesionService sesionService;

    public SesionController(SesionService sesionService) {
        this.sesionService = sesionService;
    }

    @GetMapping
    public List<Sesion> getAllSesiones() {
        return sesionService.findAll();
    }

    @PostMapping
    public Sesion createSesion(@RequestBody Sesion sesion) {
        return sesionService.save(sesion);
    }
}
