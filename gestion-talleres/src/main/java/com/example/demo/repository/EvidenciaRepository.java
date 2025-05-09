package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Evidencia;

public interface EvidenciaRepository extends JpaRepository<Evidencia, Integer> {
}
