package edu.cesur.fullstack.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import edu.cesur.fullstack.model.Persona;

@RestController
public class PersonaRestController {

	ArrayList<Persona> listaPersonas = new ArrayList<>(Arrays.asList(new Persona(1, "Juan", "Pérez", 25),
			new Persona(2, "María", "Gómez", 30), new Persona(3, "Pedro", "González", 28)));
	// ArrayList<Persona> personas = new ArrayList<>();

	@GetMapping("/personas/{id}")
	public Persona getPersona(@PathVariable int id) {
		for(Persona p : listaPersonas) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	public Persona createPersona(Persona persona) {
		return persona;

	}

	public void DeletePersona(int id) {

	}

	public Persona updatePersona(Persona persona) {
		return null;
	}

	@GetMapping("/personas")
	public ArrayList<Persona> getPersonas() {

		return listaPersonas;
	}

}
