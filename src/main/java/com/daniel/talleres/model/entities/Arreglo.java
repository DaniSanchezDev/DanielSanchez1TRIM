package com.daniel.talleres.model.entities;

import java.sql.Time;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "arreglos")
public class Arreglo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "coche_id")
    private Coche idCoche;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "taller_id")
    private Taller idTaller;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_arreglo", nullable = false)
    private LocalDate fechaArreglo;
    public Arreglo() {
    }
    
    public Arreglo(Coche idCoche, Taller idTaller, LocalDate fechaArreglo) {
        this.idCoche = idCoche;
        this.idTaller = idTaller;
        this.fechaArreglo = fechaArreglo;
    }

    public Arreglo(Integer id, Coche idCoche, Taller idTaller, LocalDate fechaArreglo) {
        this.id = id;
        this.idCoche = idCoche;
        this.idTaller = idTaller;
        this.fechaArreglo = fechaArreglo;
    }

    @Override
    public String toString() {
        return "Arreglo [id=" + id + ", idCoche=" + idCoche + ", idTaller=" + idTaller + ", fechaArreglo="
                + fechaArreglo + "]";
    }

    
    

}
