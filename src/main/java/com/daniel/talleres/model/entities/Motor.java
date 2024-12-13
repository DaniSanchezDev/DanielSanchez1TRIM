package com.daniel.talleres.model.entities;

import com.daniel.talleres.model.enumerated.TipoMotor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "motores")
public class Motor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('V6', 'W6', 'V12', 'ELECTRICO', 'HIDROGENO')", nullable = false, name = "tipo")
    private TipoMotor tipoMotor;
    @Column(name = "fabricante", length = 55, nullable = false)
    private String Fabricante;

    
    
    public Motor() {
    }

    public Motor(TipoMotor tipoMotor, String fabricante) {
        this.tipoMotor = tipoMotor;
        Fabricante = fabricante;
    }

    public Motor(Integer id, TipoMotor tipoMotor, String fabricante) {
        this.id = id;
        this.tipoMotor = tipoMotor;
        Fabricante = fabricante;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    public String getFabricante() {
        return Fabricante;
    }
    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Motor [id=" + id + ", tipoMotor=" + tipoMotor + ", Fabricante=" + Fabricante + "]";
    }


    

    
}
