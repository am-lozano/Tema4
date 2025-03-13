package examen;

import java.awt.Menu;
import java.util.Scanner;

public class EmpleadoMain {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		// funcion para almacenar la opcion del menu
		int opcion = -1;
		
		// creamos un objeto para inicializarlo posteriormente con los datos y la opcion elegida en el menu
		Empleado empleado;
		
		do { // bucle para pedir una opcion del menu mientras no se elija salir
			
			// pedimos la opcion del menu
			System.out.println("Introduzca una opcion");
			opcion = sc.nextInt();
			
			// vaciamos el bufer
			sc.nextLine();
			
			// switch para realizar una accion segun la opcion elegida en el menu
			switch (opcion) {
			case 1 -> { // Añadir empleado.
				
				// creamos un nuevo empleado con los datos introducidos
				empleado = creaEmpleado();
				
//				if (ListadoEmpleado.nuevoEmpleado(empleado)) {
//					
//				}
			}
			}
			
		} while (opcion != 0);
		
		// cerramos el escaner
		sc.close();

	}
	
	// metodo para mostrar el menu de opciones
	public void menu() {
		
		System.out.println("1. Añadir empleado.\r\n"
				+ "2. Listar empleados.\r\n"
				+ "3. Modificar horas extra.\r\n"
				+ "4. Modificar importe horas extra.\r\n"
				+ "5. Eliminar empleado.\r\n"
				+ "0. Salir.\r\n");
	}
	
	// funcion para pedir el dni
	private static String pideDni() {
		
		String dni;
		
		System.out.println("Introduzca el nombre:");
		dni = sc.nextLine();
		
		return dni;
	}
	
	// funcion para pedir el nombre
	private static String pideNombre() {
		
		String nombre;
		
		System.out.println("Introduzca el nombre:");
		nombre = sc.nextLine();
		
		return nombre;
	}
	
	// funcion para pedir el sueldo
	private static double pideSueldo() {
		
		double sueldo;
		
		System.out.println("Introuzca el sueldo base:");
		sueldo = sc.nextDouble();
		sc.nextLine();
		
		return sueldo;
	}
	
	// funcion para pedir las horas extras
	private static int pideHorasExtras() {
		
		int horas;
		
		System.out.println("Introuzca el sueldo base:");
		horas = sc.nextInt();
		sc.nextLine();
		
		return horas;
	}
	
	// funcion para pedir el importe por horas extras
	private static double pideImporte() {
		
		double importe;
		
		System.out.println("Introduz el importe por horas extras:");
		importe = sc.nextDouble();
		sc.nextLine();
		
		return importe;
	}
	
	// funcion para crear un empleado con los datos pedidos
	private static Empleado creaEmpleado() {
		
		String dni = pideDni();
		String nombre = pideNombre();
		double sueldo = pideSueldo();
		int horas = pideHorasExtras();
		
		Empleado emp = new Empleado (dni, nombre, sueldo, horas);
		
		return emp;
	}
	

}
