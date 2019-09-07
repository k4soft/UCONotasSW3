package co.edu.uco.uconotas.controller;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.service.persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/{id}/persona")
    public PersonaEntity findById(@PathVariable(value = "id", required = true) Long id){
        return personaService.findById(id);
    }
    @GetMapping("/personas")
    public List<PersonaEntity> findAll(){
        return personaService.findAll();
    }

    @DeleteMapping("{id}/persona")
    public void deleteById(@PathVariable(value = "id", required = true) Long id){
         personaService.deleteById(id);
    }

    @PostMapping("/persona")
    public void insert(@RequestBody PersonaEntity personaEntity){
        personaService.save(personaEntity);
    }

    @PutMapping("/{id}/persona")
    public void update(@RequestBody PersonaEntity personaEntity,@PathVariable(value = "id",required = true) Long id){
        personaEntity.setId(id);
        personaService.save(personaEntity);
    }


}
