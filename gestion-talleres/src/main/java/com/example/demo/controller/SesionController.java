package com.example.demo.controller;

import com.example.demo.model.Sesion;
import com.example.demo.service.SesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sesiones")
public class SesionController {

    @Autowired
    private SesionService sesionService;

    @GetMapping
    public List<Sesion> findAll() {
        return sesionService.findAll();
    }

    @PostMapping
    public Sesion save(@RequestBody Sesion sesion) {
        return sesionService.save(sesion);
    }
}