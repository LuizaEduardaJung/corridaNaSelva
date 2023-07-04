package com.example.corridanaselva.repository;

import org.springframework.stereotype.Repository;
import com.example.corridanaselva.entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface MaratonistaRepository extends JpaRepository<Maratonista, Long> {
}

