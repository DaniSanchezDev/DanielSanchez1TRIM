package com.daniel.talleres.model.entities;

import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.daniel.talleres.model.enumerated.TipoCoche;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "coches")
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "modelo", length = 55, nullable = false)
    private String modelo;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('DEPORTIVO','UTILITARIO', 'SUV')", name = "tipo", nullable = false)
    private TipoCoche tipoCoche;
    @Column(name = "matricula", nullable = false, length = 8)
    private String matricula;
    @JsonIgnore
    @OnDelete(action = OnDeleteAction.CASCADE)
    @OneToMany(mappedBy = "idCoche", cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
    private List<Arreglo> arreglos;

    
    public Coche() {
    }

    public Coche(String modelo, TipoCoche tipoCoche, String matricula, List<Arreglo> arreglos) {
        this.modelo = modelo;
        this.tipoCoche = tipoCoche;
        this.matricula = matricula;
        this.arreglos = arreglos;
    }

    public Coche(Integer id, String modelo, TipoCoche tipoCoche, String matricula, List<Arreglo> arreglos) {
        this.id = id;
        this.modelo = modelo;
        this.tipoCoche = tipoCoche;
        this.matricula = matricula;
        this.arreglos = arreglos;
    }

    public List<Arreglo> getArreglos() {
        return arreglos;
    }
    public void setArreglos(List<Arreglo> arreglos) {
        this.arreglos = arreglos;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public TipoCoche getTipoCoche() {
        return tipoCoche;
    }
    public void setTipoCoche(TipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "Coche [id=" + id + ", modelo=" + modelo + ", tipoCoche=" + tipoCoche + ", matricula=" + matricula
                + ", arreglos=" + arreglos + "]";
    }

    

    

}
