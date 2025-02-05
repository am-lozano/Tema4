package parte1.ej2;

public class Persona {

	/*
	 * Crea un programa con una clase llamada Persona que representará los datos
	 * principales de una persona: dni, nombre, apellidos y edad.
	 */

	/*
	 * Añade a la clase Persona un constructor con todos los parámetros.
	 */

	/*
	 * Aplica el encapsulamiento básico a la clase Persona: Declara todos sus
	 * atributos como private y crea todos los getters y setters necesarios (un get
	 * y un set por atributo). Los setters deben comprobar que el dato de entrada es
	 * correcto antes de asignárselo al atributo.
	 */

	// atributos de la clase Persona
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	/**
	 * Constructor para la clase Persona
	 * 
	 * @param dni       DNI de la persona
	 * @param nombre    nombre de la persona
	 * @param apellidos apellidos de la persona
	 * @param edad      edad de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {

		if (dni != null && !dni.isEmpty()) { // comprobamos que los datos introducidos son correctos

			this.dni = dni;

		}

		if (nombre != null && !nombre.isEmpty()) { // comprobamos que los datos introducidos son correctos

			this.nombre = nombre;

		}

		if (apellidos != null && !apellidos.isEmpty()) { // comprobamos que los datos introducidos son correctos

			this.apellidos = apellidos;

		}

		if (edad >= 0) { // comprobamos que los datos introducidos son correctos

			this.edad = edad;

		}
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		
		if (dni != null && !dni.isEmpty()) { // comprobamos que el dato es valido
			
			this.dni = dni;
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		if (nombre != null && !nombre.isEmpty()) { // comprobamos que el dato es valido
			
			this.nombre = nombre;
		}
	}
	
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		
		if (apellidos != null && !apellidos.isEmpty()) { // comprobamos que el dato es valido
			
			this.apellidos = apellidos;
		}
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		
		if (edad > 0) { // comprobamos que el dato es valido
			
			this.edad = edad;
		}
	}

}
