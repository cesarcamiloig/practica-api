package com.example.demo.controller;

import com.example.demo.model.Participante;
import com.example.demo.service.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;

    @GetMapping
    public List<Participante> listarParticipantes() {
        return participanteService.findAll();
    }

    @PutMapping("/{id}")
    public Participante actualizarParticipante(@RequestBody Participante participante) {
        return participanteService.save(participante);
    }
}
