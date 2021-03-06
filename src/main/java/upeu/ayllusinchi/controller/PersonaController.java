/*
    Controlador de La tabla persona
 */
package upeu.ayllusinchi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upeu.ayllusinchi.entity.Persona;
import upeu.ayllusinchi.service.PersonaService;

/**
 *
 
 */
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/all")
    public List<Persona> findAll() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> findById(@PathVariable Long id) {
        Persona persona = personaService.findById(id);
        return ResponseEntity.ok(persona);
    }
    @GetMapping("/dni/{dni}")
    public ResponseEntity<Persona> findByPersDni(@PathVariable String dni) {
        Persona persona = personaService.findByPersDni(dni);
        return ResponseEntity.ok(persona);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        personaService.deleteById(id);
    }

    @PostMapping("/save")
    public Persona save(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @PutMapping("/update")
    public Persona update(@RequestBody Persona persona) {
        return personaService.save(persona);
    }
}

/*RequestBody: Esta anotación indica que Spring debe deserializar un cuerpo de
solicitud en un objeto. Este objeto se pasa como un parámetro de método de
controlador.*/