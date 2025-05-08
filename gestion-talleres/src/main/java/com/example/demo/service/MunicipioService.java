package com.example.demo.service;

import com.example.demo.model.Municipio;
import com.example.demo.repository.MunicipioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipioService {

    private final MunicipioRepository municipioRepository;

    public MunicipioService(MunicipioRepository municipioRepository) {
        this.municipioRepository = municipioRepository;
    }

    public List<Municipio> findAll() {
        return municipioRepository.findAll();
    }

    public Municipio save(Municipio municipio) {
        return municipioRepository.save(municipio);
    }
}
