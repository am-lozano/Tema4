package crud.ej1;

import java.util.Scanner;

public class PrincipalAlumno {
	public static void main(String[] args) {

		/*
		 * En el método principal se mostrará el siguiente menú de opciones para
		 * gestionar al alumnado:
		 * 
		 * ALUMNOS/AS 
		 * ===================
		 * 
		 * 1. Listado. 
		 * 2. Nuevo Alumno. 
		 * 3. Modificar. 
		 * 4. Borrar. 
		 * 5. Salir.
		 * 
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

		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		// variable para almacenar la opcion que se quiere elegir en el menu
		int opcion = 0;
		
//		/* Creamos varios alumnos */
//		Alumno alumno1 = new Alumno("Pepe Martínez Pérez", 7.7);
//		Alumno alumno2 = new Alumno(null, -5.5);
//		Alumno alumno3 = new Alumno("Pepe Martínez Pérez", 5.6);
//
//		/* Mostramos la informacion de los alumnos */
//		System.out.println(alumno1.toString());
//		System.out.println(alumno2.toString());
//		System.out.println(alumno3.toString());
//
//		/* Mostramos si los alumnos 1 y 2 son iguales o no */
//		if (alumno1.equals(alumno2)) {
//			System.out.println("Los alumnos son iguales");
//		} else {
//			System.out.println("Los alumnos no son iguales");
//		}
//
//		/* Mostramos si los alumnos 1 y 3 son iguales o no */
//		if (alumno1.equals(alumno3)) {
//			System.out.println("Los alumnos son iguales");
//		} else {
//			System.out.println("Los alumnos no son iguales");
//		}
//
//		/* Cambiamos los valores */
//		alumno1.setNombre(null);
//		alumno1.setNotaMedia(-5);
//
//		alumno2.setNombre("Pepe Martínez Pérez");
//		alumno2.setNotaMedia(8);
//
//		/* Mostramos los alumnos */
//		System.out.println(alumno1.getNombre() + " " + alumno1.getNotaMedia());
//		System.out.println(alumno2.getNombre() + " " + alumno2.getNotaMedia());
		
		// bucle para mostrar el menu hasta que se introduzca la opcion de salir
		do {
			
			mostrarMenu();
						
			// pedimos la opcion que se quiere hacer
			System.out.println("Introduzca una opcion para realizar");
			opcion = sc.nextInt();
			
			// switch para realizar la accion elegida en el menu
			switch (opcion) {
			
			case 1 -> {
				
			}
			case 2 -> {
				
			}
			case 3 -> {
				
			}
			case 4 -> {
				
			}
			case 5 -> {
				
				System.out.println("Saliendo del programa");
			}
			}
			
		} while (opcion != 5);
		
	}
	
	// funcion para mostrar el menu con las distintas opciones que se pueden hacer
	public static void mostrarMenu () {
		
		System.out.println("ALUMNOS/AS");
		System.out.println("===================");
		System.out.println();
		System.out.println("1. Listado.\r\n"
				+ "2. Nuevo Alumno.\r\n"
				+ "3. Modificar.\r\n"
				+ "4. Borrar.\r\n"
				+ "5. Salir.\r\n");
	}
}
