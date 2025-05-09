package com.example.demo.controller;

import com.example.demo.model.Participante;
import com.example.demo.service.ParticipanteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

    private final ParticipanteService participanteService;

    public ParticipanteController(ParticipanteService participanteService) {
        this.participanteService = participanteService;
    }

    @GetMapping
    public List<Participante> getAll() {
        return participanteService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Participante> getById(@PathVariable Integer id) {
        return participanteService.findById(id);
    }

    @PostMapping
    public Participante create(@RequestBody Participante participante) {
        return participanteService.save(participante);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        participanteService.deleteById(id);
    }
}
