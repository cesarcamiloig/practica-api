package com.example.demo.controller;

import com.example.demo.model.Ubicacion;
import com.example.demo.service.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {

    @Autowired
    private UbicacionService ubicacionService;

    @GetMapping
    public List<Ubicacion> findAll() {
        return ubicacionService.findAll();
    }

    @PostMapping
    public Ubicacion save(@RequestBody Ubicacion ubicacion) {
        return ubicacionService.save(ubicacion);
    }
}