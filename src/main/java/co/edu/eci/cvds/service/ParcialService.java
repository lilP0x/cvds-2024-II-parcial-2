package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcialService {
    private final ParcialRepositoryRepository ParcialRepository;

    @Autowired
    public ParcialService(ParcialRepository ParcialRepository) {
        this.ParcialRepository = ParcialRepository;
    }

    public Parcial addParcial(Parcial parcial) {
        return ParcialRepository.save(parcial);
    }

    public Parcial getParcial(String pregunta) {
        return ParcialRepository.findByPropiedad(pregunta).get(1);
    }

    public List<Parcial> getAllParcial() {
        return ParcialRepository.findAll();
    }

    public Parcial updateParcial(Parcial parcial) {
        if (ParcialRepository.findByPropiedad(parcial.getPregunta)).size() == 0) {
            return ParcialRepository.save(parcial);
        }
        return null;
    }

    public void deleteParcial(String pregunta) {
        ParcialRepository.deleteById(pregunta);
    }

    public String getPremio() {
        return configurationRepository.findByPropiedad("premio").get(0).getValor();
    }
}