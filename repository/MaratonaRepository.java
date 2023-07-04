package com.example.corridanaselva.repository;

import com.example.corridanaselva.entity.Circuito;
import com.example.corridanaselva.entity.Maratona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonaRepository extends JpaRepository<Maratona, Long> {
}
