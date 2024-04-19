package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.Parcial;
import co.edu.eci.cvds.repository.ParcialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcialService {
    private final ParcialRepository parcialRepository;

    @Autowired
    public ParcialService(ParcialRepository parcialRepository) {
        this.parcialRepository = parcialRepository;
    }

    public Parcial addParcial(Parcial parcial) {
        return parcialRepository.save(parcial);
    }

    public Parcial getParcial(String pregunta) {
        return parcialRepository.findByPregunta(pregunta).get(1);
    }

    public List<Parcial> getAllParcial() {
        return parcialRepository.findAll();
    }

    public Parcial updateParcial(Parcial parcial) {
        if (parcialRepository.findByPregunta(parcial.getPregunta()).size() == 0) {
            return parcialRepository.save(parcial);
        }
        return null;
    }

    public void deleteParcial(String pregunta) {
        parcialRepository.deleteById(pregunta);
    }

}