package com.example.demo.controller;

import com.example.demo.model.Participante;
import com.example.demo.service.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;

    // GET /api/participantes - Listar participantes
    @GetMapping
    public List<Participante> listarParticipantes() {
        return participanteService.findAll();
    }

    // PUT /api/participantes/{id} - Actualizar participante
    @PutMapping("/{id}")
    public ResponseEntity<Participante> actualizarParticipante(@PathVariable Integer id, @RequestBody Participante participante) {
        Optional<Participante> participanteExistente = participanteService.findById(id);

        if (participanteExistente.isPresent()) {
            participante.setId(id);
            Participante actualizado = participanteService.save(participante);
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
