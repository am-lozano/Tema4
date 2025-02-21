package parte3.ej3;

public class SumaEnteros {

	/*
	 * La primera de las funciones recibirá un argumento (numero) de tipo entero y
	 * devolverá la suma de todos los números desde 1 hasta numero. El valor a
	 * devolver debe ser entero.
	 * 
	 * La segunda de las funciones recibirá dos argumentos (num1 y num2) de tipo
	 * entero y devolverá la suma de todos los números comprendidos entre los dos
	 * números (num1 y num2). El tipo a devolver debe ser entero.
	 * 
	 */

	/**
	 * funcion para sumar los numeros desde 1 hasta el numero pasado por parametro
	 * de entrada
	 * 
	 * @param numero numero maximo hasta el que se suma
	 * @return suma de los numeros desde 1 hasta numero
	 */
	static int suma(int numero) {

		// variable para almacenar la suma de los numeros
		int total = 0;
		
		// sumamos los numeros desde 1 hasta numero
		for (int i = 1; i < numero; i++) {

			total += i;
		}

		return total;
	}

	/**
	 * funcion para sumar los numeros comprendidos entre el numero 1 y el numero 2
	 * 
	 * @param num1 numero desde el que se empieza
	 * @param num2 numero limite del rango de la suma
	 * @return suma de los numeros enteros comprendidos entre num1 y num2
	 */
	static int suma(int num1, int num2) {


		// variable para almacenar la suma de los numeros
		int total = 0;
		
		// sumamos los numeros desde 1 hasta numero
		for (int i = (num1 + 1); i < num2; i++) {

			total += i;
		}

		return total;
	}

}
