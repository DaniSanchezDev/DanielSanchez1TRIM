package com.daniel.talleres.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.talleres.model.entities.Coche;
import com.daniel.talleres.model.services.interfaces.ICocheService;

import jakarta.transaction.Transactional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/coches")
public class CocheController {

    @Autowired
    private ICocheService cocheServ;

    @GetMapping("/all")
    public List<Coche> getAllCoches(){
        return cocheServ.getCoches();
    }

    // Response Entity
    @GetMapping("/{id}")
    public ResponseEntity<Coche> getCocheById(@PathVariable("id") Integer id){
        Coche coche = cocheServ.getById(id);
        if (coche == null) {
            return ResponseEntity.noContent().build();
        } else{
            return ResponseEntity.ok(coche);
        }
    }

    @PostMapping("/save")
    public Coche guardarCoche(Coche coche){
        return cocheServ.saveCoche(coche);
    }

    @PutMapping("/update")
    public Coche updateCoche(Coche coche){
        return cocheServ.updateCoche(coche);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> borrarCoche(@PathVariable("id") Integer id){
        cocheServ.deleteCoche(id);
        return ResponseEntity.noContent().build();
    }
    
    
}
    






















