package parte1.ej2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		/*
		 * Crea un programa con una clase llamada Persona que representará los datos
		 * principales de una persona: dni, nombre, apellidos y edad.
		 * 
		 * En el main de la clase principal instancia dos objetos de la clase Persona.
		 * Luego, pide por teclado los datos de ambas personas (guárdalos en los
		 * objetos). Por último, imprime dos mensajes por pantalla (uno por objeto) con
		 * un mensaje del estilo “Azucena Luján García con DNI … es / no es mayor de
		 * edad”.
		 */

		/*
		 * Modifica el main para utilizar el constructor con parámetros en vez de
		 * modificar directamente los atributos.
		 */

		/*
		 * Corrige el main para utilizar los getters y setters. Prueba a instanciar
		 * varios objetos, mostrar sus valores por pantalla, modificarlos, etc.
		 */

		// variables para asignar valores a los atributos del objeto persona
		String dni = "";
		String nombre = "";
		String apellidos = "";
		int edad;

		// instanciamos 2 objetos de la clase persona
		Persona p1;
		Persona p2;

		// creamos el escaner para pedir datos por consola
		Scanner sc = new Scanner(System.in);

		// pedimos los datos de la persona 1
		System.out.println("Introduzca su DNI persona 1:");
		dni = sc.nextLine();
		System.out.println();

		System.out.println("Introduzca su nombre persona 1:");
		nombre = sc.nextLine();
		System.out.println();

		System.out.println("Introduzca sus apellidos persona 1:");
		apellidos = sc.nextLine();
		System.out.println();

		System.out.println("Introduzca su edad persona 1:");
		edad = sc.nextInt();

		// vaciamos el bufer
		sc.nextLine();

		// cramos el objeto p1
		p1 = new Persona(dni, nombre, apellidos, edad);

		System.out.println();

		// pedimos los datos de la persona 2
		System.out.println("Introduzca su DNI persona 2:");
		dni = sc.nextLine();
		System.out.println();

		System.out.println("Introduzca su nombre persona 2:");
		nombre = sc.nextLine();
		System.out.println();

		System.out.println("Introduzca sus apellidos persona 2:");
		apellidos = sc.nextLine();
		System.out.println();

		System.out.println("Introduzca su edad persona 2:");
		edad = sc.nextInt();

		// vaciamos el bufer
		sc.nextLine();

		System.out.println();

		// cramos el objeto p2
		p2 = new Persona(dni, nombre, apellidos, edad);

		// mostramos los datos de persona 1
		System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni()
				+ (p1.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad") + "(" + p1.getEdad() + ")");
		System.out.println();

		// mostramos los datos de persona 2
		System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni()
				+ (p2.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad") + "(" + p2.getEdad() + ")");
		System.out.println();

	}

}
