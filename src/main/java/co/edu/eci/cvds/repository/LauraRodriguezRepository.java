package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.LauraRodriguez;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LauraRodriguezRepository extends JpaRepository<LauraRodriguez, String> {
    public List<LauraRodriguez> findByNumero(String numero);
}
