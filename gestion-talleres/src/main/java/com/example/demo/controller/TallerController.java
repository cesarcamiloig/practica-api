package com.example.demo.controller;

import com.example.demo.model.Taller;
import com.example.demo.service.TallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/talleres")
public class TallerController {

    @Autowired
    private TallerService tallerService;

    @GetMapping
    public List<Taller> findAll() {
        return tallerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Taller> findById(@PathVariable Integer id) {
        return tallerService.findById(id);
    }

    @PostMapping
    public Taller save(@RequestBody Taller taller) {
        return tallerService.save(taller);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        tallerService.deleteById(id);
    }
}