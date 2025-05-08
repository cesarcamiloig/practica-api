package com.example.demo.service;

import com.example.demo.model.Colegio;
import com.example.demo.repository.ColegioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColegioService {

    private final ColegioRepository colegioRepository;

    public ColegioService(ColegioRepository colegioRepository) {
        this.colegioRepository = colegioRepository;
    }

    public List<Colegio> findAll() {
        return colegioRepository.findAll();
    }

    public Colegio save(Colegio colegio) {
        return colegioRepository.save(colegio);
    }
}
