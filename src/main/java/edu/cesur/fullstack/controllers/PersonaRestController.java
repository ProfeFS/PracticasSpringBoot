package edu.cesur.fullstack.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.fullstack.model.Persona;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	ArrayList<Persona> listaPersonas = new ArrayList<>(
			Arrays.asList(new Persona(1, "Juan", "Pérez", 25), new Persona(2, "María", "Gómez", 30),
					new Persona(3, "Pedro", "González", 28), new Persona(4, "Anna", "Martínez", 28)));
	
	
	

	@GetMapping("/{id}")
	public ResponseEntity<?> getPersona(@PathVariable int id) {
		
		if(id < 0) {
			return ResponseEntity.badRequest().build();
		}
		
		for (Persona p : listaPersonas) {
			if (p.getId() == id) {
				return ResponseEntity.ok(p);
			}
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping
	public ResponseEntity<?> createPersona(@RequestBody Persona persona) {
		listaPersonas.add(persona);
		
		URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(persona.getId())
                .toUri();
		
		return ResponseEntity.created(location).build();

	}

	@DeleteMapping("/{id}")
	public ResponseEntity deletePersona(@PathVariable int id) {
		
		if(id < 0) {
			return ResponseEntity.badRequest().build();
		}
		
		for (Persona persona : this.listaPersonas) {
			if (persona.getId()==id) {
				this.listaPersonas.remove(persona);
				return ResponseEntity.noContent().build();
			}
		}
		
		return ResponseEntity.notFound().build();
		

	}

	@PutMapping
	public ResponseEntity<?> updatePersona(@RequestBody Persona persona) {
		for (Persona p : listaPersonas) {
			if (p.getId() == persona.getId()) {
				p.setName(persona.getName());
				p.setLastName(persona.getLastName());
				p.setAge(persona.getAge());

				return ResponseEntity.ok(p);
			}
		}

		return ResponseEntity.notFound().build();
	}

	@GetMapping
	public ResponseEntity<?> getPersonas() {

		return ResponseEntity.ok(listaPersonas);
	}

}
