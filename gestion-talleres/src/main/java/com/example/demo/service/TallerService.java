package com.example.demo.service;

import com.example.demo.model.Taller;
import com.example.demo.repository.TallerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TallerService {

    @Autowired
    private TallerRepository tallerRepository;

    public List<Taller> findAll() {
        return tallerRepository.findAll();
    }

    public Optional<Taller> findById(Integer id) {
        return tallerRepository.findById(id);
    }

    public Taller save(Taller taller) {
        return tallerRepository.save(taller);
    }

    public void deleteById(Integer id) {
        tallerRepository.deleteById(id);
    }
}
