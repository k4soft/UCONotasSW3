package co.edu.uco.uconotas.repository;

import co.edu.uco.uconotas.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Long> {
}
