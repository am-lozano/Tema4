package crud.alumno;

import java.util.Scanner;

public class AlumnoMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;

		String nombre = "";

		double nota = 0;

		Alumno alumn;
		
		double notaNueva = 0;

		do {

			menu();

			System.out.println("Introduzca una opcion:");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {

			case 1 -> {
				System.out.println("\n" + "Lista de alumnos:");
				AlumnoCRIUD.mostrarLista();
			}
			case 2 -> {
				
				alumn = crearAlumn();
				
				if (AlumnoCRIUD.anadirAlum(alumn)) {
					
					System.out.println("Anadido correctamente");
					
				} else {
					
					System.out.println("Error");
				}
				
			}
			case 3 -> {
				
				alumn = crearAlumn();
				
				System.out.println("Introduzca la nota nueva del alumno:");
				notaNueva = sc.nextDouble();
				sc.nextLine();
				
				if (AlumnoCRIUD.modificarAlum(alumn, notaNueva)) {
					
					System.out.println("Modificacion realizada");
					
				} else {
					
					System.out.println("Error");
				}
			}
			case 4 -> {
				
				alumn = crearAlumn();
				
				if (AlumnoCRIUD.eliminarAlum(alumn)) {
					
					System.out.println("Borrado correctamente");
					
				} else {
					
					System.out.println("Error");
				}
			}
			case 5 -> System.out.println("Saliendo");
			default -> System.out.println("Opcion incorrecta");
			}

		} while (opcion != 5);
		
		sc.close();

	}

	static void menu() {

		System.out.println();
		System.out.println("ALUMNOS/AS\r\n" + "===================\r\n" + "1. Listado.\r\n" + "2. Nuevo Alumno.\r\n"
				+ "3. Modificar.\r\n" + "4. Borrar.\r\n" + "5. Salir.\r\n");
	}

	private static String pideNombre() {

		String nombre;
		
		System.out.println("Introduzca el nombre:");
		nombre = sc.nextLine();
		
		return nombre;

	}
	
	private static double pideNota() {
		
		double nota;
		
		System.out.println("Introduzca la nota:");
		nota = sc.nextDouble();
		sc.nextLine();
		
		return nota;
	}
	
	private static Alumno crearAlumn() {
		
		String nombre;
		
		double nota;
		
		Alumno al = null;
		
		nombre = pideNombre();
		
		nota = pideNota();
		
		al = new Alumno(nombre, nota);
		
		return al;
	}

}
