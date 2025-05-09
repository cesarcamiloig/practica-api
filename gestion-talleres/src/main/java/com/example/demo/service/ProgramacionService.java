package com.example.demo.service;

import com.example.demo.model.Programacion;
import com.example.demo.repository.ProgramacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramacionService {

    private final ProgramacionRepository programacionRepository;

    public ProgramacionService(ProgramacionRepository programacionRepository) {
        this.programacionRepository = programacionRepository;
    }

    public List<Programacion> findAll() {
        return programacionRepository.findAll();
    }

    public Programacion save(Programacion programacion) {
        return programacionRepository.save(programacion);
    }
}
