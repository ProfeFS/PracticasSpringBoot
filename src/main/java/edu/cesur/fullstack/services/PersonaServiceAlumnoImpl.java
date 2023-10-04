package edu.cesur.fullstack.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.Persona;


@Service("alumnos")
public class PersonaServiceAlumnoImpl implements PersonaService {
	
	ArrayList<Persona> listaEstudiantes = new ArrayList<>(
			Arrays.asList(new Persona(1, "Miriam", "Rodríguez", 25),
					new Persona(2, "Mireia", "Gómez", 30),
					new Persona(3, "Javier", "Lupión", 28),
					new Persona(4, "Marcos", "Martínez", 28)));

	@Override
	public ArrayList<Persona> getAllPersonas() {
		return listaEstudiantes;
	}


}
