package com.daniel.talleres.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.talleres.model.entities.Motor;

public interface IMotorRepository extends JpaRepository<Motor, Integer>{

}
