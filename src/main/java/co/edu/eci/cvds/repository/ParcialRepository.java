package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.Parcial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParcialRepository extends JpaRepository<Parcial, String> {
    public List<Parcial> findByPregunta(String pregunta);

}