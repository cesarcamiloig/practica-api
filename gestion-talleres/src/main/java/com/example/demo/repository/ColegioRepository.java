package com.example.demo.repository;

import com.example.demo.model.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColegioRepository extends JpaRepository<Colegio, String> {
}
