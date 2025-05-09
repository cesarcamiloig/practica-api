package com.example.demo.service;

import com.example.demo.model.Asistente;
import com.example.demo.repository.AsistenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsistenteService {

    @Autowired
    private AsistenteRepository asistenteRepository;

    public List<Asistente> findAll() {
        return asistenteRepository.findAll();
    }

    public Optional<Asistente> findById(Integer id) {
        return asistenteRepository.findById(id);
    }

    public Asistente save(Asistente asistente) {
        return asistenteRepository.save(asistente);
    }

    public void deleteById(Integer id) {
        asistenteRepository.deleteById(id);
    }
}
