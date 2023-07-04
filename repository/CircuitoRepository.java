package com.example.corridanaselva.repository;

import com.example.corridanaselva.entity.Circuito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitoRepository extends JpaRepository<Circuito, Long> {
}
