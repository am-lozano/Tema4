package parte3.ej5;

import java.util.Random;

public class Aleatorios {

	/*
	 * La primera de las funciones recibirá un argumento de tipo entero que indicará
	 * la cantidad de números aleatorios a generar. Esta función generará números
	 * aleatorios comprendidos entre 0 y 1 y los mostrará por pantalla.
	 * 
	 * La segunda de las funciones recibirá dos argumentos de tipo entero: El
	 * primero indica la cantidad de números aleatorios a generar El segundo indica
	 * el valor máximo que tomará el número aleatorio.
	 * 
	 * Los números aleatorios generados deben estar entre 0 y el valor máximo
	 * introducido por parámetro. En este caso los números aleatorios deben ser
	 * enteros. Los números aleatorios generados deben mostrarse por pantalla.
	 * 
	 * La tercera de las funciones recibirá tres argumentos de tipo entero: El
	 * primero indica la cantidad de números aleatorios a generar El segundo indica
	 * el valor mínimo que tomará el número aleatorio. El tercero indica el valor
	 * máximo que tomará el número aleatorio.
	 */

	static void numerosAleatorios(int num) {

		// clase random para generar numeros aleatorios
		Random rand = new Random();

		// variable para almacenar los numeros aleatorios generados
		int aleatorio;

		for (int i = 0; i < num; i++) {

			// generamos un numero aleatorio y lo almacenamos en la variable
			System.out.println(aleatorio = rand.nextInt(0, 2));

		}

	}

	static void numerosAleatorios(int num, int max) {

		// clase random para generar numeros aleatorios
		Random rand = new Random();

		// variable para almacenar los numeros aleatorios generados
		int aleatorio;

		for (int i = 0; i < num; i++) {

			// generamos un numero aleatorio y lo almacenamos en la variable
			System.out.println(aleatorio = rand.nextInt(0, max));

		}

	}
	
	static void numerosAleatorios(int num, int min, int max) {
		
		// clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// variable para almacenar los numeros aleatorios generados
		int aleatorio;
		
		for (int i = 0; i < num; i++) {
			
			// generamos un numero aleatorio y lo almacenamos en la variable
			System.out.println(aleatorio = rand.nextInt(min, max));
			
		}
		
	}

}
