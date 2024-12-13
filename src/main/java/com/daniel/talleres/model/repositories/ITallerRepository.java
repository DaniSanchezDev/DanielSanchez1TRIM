package com.daniel.talleres.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.talleres.model.entities.Taller;

public interface ITallerRepository extends JpaRepository<Taller, Integer>{

}
