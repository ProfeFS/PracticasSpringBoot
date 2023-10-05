package edu.cesur.fullstack.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.Persona;

//@Primary
@Lazy
@Service("pro")
//@ConditionalOnProperty(prefix ="implementacion", value ="persona", havingValue = "pro")
public class PersonaServiceProImpl implements PersonaService {
	
	ArrayList<Persona> listaPersonasPro = new ArrayList<>(
			Arrays.asList(new Persona(1, "Miriam", "Rodríguez", 25),
					new Persona(2, "Mireia", "Gómez", 30),
					new Persona(3, "Javier", "Lupión", 28),
					new Persona(4, "Marcos", "Martínez", 28)));

	@Override
	public ArrayList<Persona> getAllPersonas() {
		return listaPersonasPro;
	}


}
