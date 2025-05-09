package com.example.demo.service;

import com.example.demo.model.Participante;
import com.example.demo.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;

    public List<Participante> findAll() {
        return participanteRepository.findAll();
    }

    public Optional<Participante> findById(Integer id) {
        return participanteRepository.findById(id);
    }

    public Participante save(Participante participante) {
        return participanteRepository.save(participante);
    }

    public void deleteById(Integer id) {
        participanteRepository.deleteById(id);
    }
}
