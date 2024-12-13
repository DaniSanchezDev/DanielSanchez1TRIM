package com.daniel.talleres.model.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.talleres.model.entities.Coche;
import com.daniel.talleres.model.repositories.ICocheRepository;
import com.daniel.talleres.model.services.interfaces.ICocheService;

@Service
public class CocheService implements ICocheService{

    @Autowired
    private ICocheRepository cocheRepo;

    @Override
    public List<Coche> getCoches() {
        return cocheRepo.findAll();
    }

    @Override
    public Coche getById(Integer id) {
        Optional<Coche> op = cocheRepo.findById(id);
        if (op.isPresent()) {
            return op.get();
        } return null;
    }

    @Override
    public Coche saveCoche(Coche coche) {
        return cocheRepo.save(coche);
    }

    @Override
    public Coche updateCoche(Coche coche) {
        Optional<Coche> cocheActualizado = cocheRepo.findById(coche.getId());
        if (cocheActualizado.isPresent()) {
            Coche antiguoCoche = cocheActualizado.get();
            antiguoCoche.setModelo(coche.getModelo());
            antiguoCoche.setMatricula(coche.getMatricula());
            antiguoCoche.setTipoCoche(coche.getTipoCoche());
            return cocheRepo.save(antiguoCoche);

        } else{
            return null;
        }
    }

    @Override
    public void deleteCoche(Integer id) {
        cocheRepo.deleteById(id);
    }

}
