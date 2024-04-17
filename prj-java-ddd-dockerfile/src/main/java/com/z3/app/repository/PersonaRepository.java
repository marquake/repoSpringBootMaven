package com.z3.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.z3.app.data.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
