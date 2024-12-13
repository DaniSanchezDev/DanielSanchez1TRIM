package com.daniel.talleres.model.services.interfaces;

import java.util.List;

import com.daniel.talleres.model.entities.Coche;

public interface ICocheService {

    public List<Coche> getCoches();
    public Coche getById(Integer id);
    public Coche saveCoche(Coche coche);
    public Coche updateCoche(Coche coche);
    public void deleteCoche(Integer id);


}
