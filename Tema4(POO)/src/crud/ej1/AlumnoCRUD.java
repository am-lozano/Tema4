package crud.ej1;

import java.util.ArrayList;

public class AlumnoCRUD {

	/*
	 * Crea una colección donde almacenar los alumnos de una clase. Toda la gestión
	 * de la lista se debería de hacer en una clase independiente de Alumno.
	 */

	/*
	 * Opción 1: Imprimirá el listado de alumnos. Un alumno por línea.
	 * 
	 * Opción 2: Deberá pedir los datos del alumno, crearlo y añadirlo a la lista.
	 * 
	 * Opción 3: Para modificar un alumno debemos buscarlo por su nombre. En caso de
	 * que esté, entonces se le pedirá al usuario por teclado la nota del alumno
	 * para modificarla. Sólo se modifica la nota.
	 * 
	 * Opción 4: Para borrar un alumno debemos pedir al usuario el nombre del alumno
	 * a borrar y eliminarlo de la lista.
	 */

	// coleccion para almacenar los alumnos de una clase
	static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	/**
	 * funcion para imprimir la lista de los jugadores
	 */
	public static void mostrarLista() {
		
		// recorremos la lista y mostramos cada alumno
		for (int i = 0; i < alumnos.size(); i++) {
			System.out.println(alumnos);
		}
	}
	
	/**
	 * funcion para crear y anadir a un alumno a la lista
	 * 
	 * @param nombre nombre del alumno
	 * @param nota nota media del alumno
	 */
	public static void anadirAlumno(String nombre, double nota) {
		
		
	}

}
