package com.example.demo.repository;

import com.example.demo.model.Programacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramacionRepository extends JpaRepository<Programacion, Long> {
}
