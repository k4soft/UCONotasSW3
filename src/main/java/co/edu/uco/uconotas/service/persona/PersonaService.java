package co.edu.uco.uconotas.service.persona;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;

import java.util.List;

public interface PersonaService {


    Persona findById(Long id);

    List<Persona> findAll();

    void deleteById(Long id);

    void save(Persona personaEntity);




}
