package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.LauraRodriguez;
import co.edu.eci.cvds.repository.LauraRodriguezRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LauraRodriguezService {
    private final LauraRodriguezRepository lauraRodriguezRepository;

    @Autowired
    public LauraRodriguezService(LauraRodriguezRepository lauraRodriguezRepository) {
        this.lauraRodriguezRepository = lauraRodriguezRepository;
    }

    public List<LauraRodriguez> getAllLauraRodriguez() {
        return lauraRodriguezRepository.findAll();
    }

}