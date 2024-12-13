package com.daniel.talleres.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.talleres.model.entities.Arreglo;

public interface IArregloRepository extends JpaRepository<Arreglo, Integer>{
    
}
