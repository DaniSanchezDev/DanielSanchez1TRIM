package com.daniel.talleres.model.entities;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "talleres")
public class Taller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", nullable = false, length = 55)
    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "motor_id", referencedColumnName = "id")
    private Motor motor;
    
    @OneToMany(mappedBy = "idTaller", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Arreglo> arreglos;   
    
    
    public Taller() {
    }
    
    public Taller(String nombre, Motor motor, List<Arreglo> arreglos) {
        this.nombre = nombre;
        this.motor = motor;
        this.arreglos = arreglos;
    }

    public Taller(Integer id, String nombre, Motor motor, List<Arreglo> arreglos) {
        this.id = id;
        this.nombre = nombre;
        this.motor = motor;
        this.arreglos = arreglos;
    }

    public List<Arreglo> getArreglos() {
        return arreglos;
    }
    public void setArreglos(List<Arreglo> arreglos) {
        this.arreglos = arreglos;
    }
    public Taller(String nombre) {
        this.nombre = nombre;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Taller [id=" + id + ", nombre=" + nombre + ", motor=" + motor + ", arreglos=" + arreglos + "]";
    }

    



}
