package co.edu.uco.uconotas.converter;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.model.Persona;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PersonaConverter {


    public Persona entityToModel(PersonaEntity personaEntity) {
        var persona = new Persona();
        persona.setId(personaEntity.getId());
        persona.setNombre(personaEntity.getNombre());
        persona.setApellido(personaEntity.getApellido());
        return persona;
    }


    public PersonaEntity modelToEntity(Persona persona) {
        var personaEntity = new PersonaEntity();
        personaEntity.setId(persona.getId());
        personaEntity.setNombre(persona.getNombre());
        personaEntity.setApellido(persona.getApellido());
        return personaEntity;
    }

    public List<Persona> entityToModel(List<PersonaEntity> personasEntity) {
        List<Persona> personas = new ArrayList<>(personasEntity.size());
        personasEntity.forEach(entity -> {
            personas.add(entityToModel(entity));
        });
        return personas;
    }

    public Persona entityToModel(Optional<PersonaEntity> personaEntity) {
        Persona persona = null;
        if (personaEntity.isPresent()) {
            persona = new Persona();
            persona.setId(personaEntity.get().getId());
            persona.setNombre(personaEntity.get().getNombre());
            persona.setApellido(personaEntity.get().getApellido());
            return persona;
        }
        return persona;
    }
}
