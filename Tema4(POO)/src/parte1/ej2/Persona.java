package parte1.ej2;

public class Persona {

	/*
	 * Crea un programa con una clase llamada Persona que representará los datos
	 * principales de una persona: dni, nombre, apellidos y edad.
	 */

	// atributos de la clase Persona
	String dni;
	String nombre;
	String apellidos;
	int edad;

	/*
	 * Añade a la clase Persona un constructor con todos los parámetros.
	 */
	
	/**
	 * Constructor para la clase Persona
	 * 
	 * @param dni DNI de la persona
	 * @param nombre nombre de la persona
	 * @param apellidos apellidos de la persona
	 * @param edad edad de la persona
	 */
	public Persona (String dni, String nombre, String apellidos, int edad){
		
		if (dni != null && !dni.isEmpty()) { // comprobamos que los datos introducidos son correctos

			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			
		}
		
		if (edad >= 0) { // comprobamos que los datos introducidos son correctos
			
			this.edad = edad;
			
		}
	}

}
