package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.DanielAcero;
import co.edu.eci.cvds.repository.DanielAceroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanielAceroService {
    private final DanielAceroRepository DanielAceroRepository;

    @Autowired
    public DanielAceroService(DanielAceroRepository DanielAceroRepository) {
        this.DanielAceroRepository = DanielAceroRepository;
    }

    public List<DanielAcero> getAllDanielAcero() {
        return DanielAceroRepository.findAll();
    }

}