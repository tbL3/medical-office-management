package com.example.practitioner.repository;

import com.example.practitioner.model.Practitioner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PractitionerRepository extends JpaRepository<Practitioner, Long> {
}

