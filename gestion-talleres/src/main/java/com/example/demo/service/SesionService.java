package com.example.demo.service;

import com.example.demo.model.Sesion;
import com.example.demo.repository.SesionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SesionService {

    private final SesionRepository sesionRepository;

    public SesionService(SesionRepository sesionRepository) {
        this.sesionRepository = sesionRepository;
    }

    public List<Sesion> findAll() {
        return sesionRepository.findAll();
    }

    public Sesion save(Sesion sesion) {
        return sesionRepository.save(sesion);
    }
}
