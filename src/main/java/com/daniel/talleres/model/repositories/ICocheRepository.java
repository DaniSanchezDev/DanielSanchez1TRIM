package com.daniel.talleres.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.talleres.model.entities.Coche;

public interface ICocheRepository extends JpaRepository<Coche, Integer>{

}
