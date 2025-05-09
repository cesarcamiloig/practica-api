package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Taller;

public interface TallerRepository extends JpaRepository<Taller, Integer> {
}
