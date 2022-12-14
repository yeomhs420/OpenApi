package com.example.demo.jpa.repository;

import com.example.demo.sampleobject.CovidInfectionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CovidInfectionStatusRepository extends JpaRepository<CovidInfectionStatus, Integer> {
    public List<CovidInfectionStatus> findAll();
}
