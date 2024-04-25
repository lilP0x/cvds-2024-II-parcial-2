package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.DanielAcero;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DanielAceroRepository extends JpaRepository<DanielAcero, String> {
    public List<DanielAcero> findByNumero(String numero);
}