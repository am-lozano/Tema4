package parte3.ej1;

public class SumaNumeros {

	/*
	 * Diseña una clase que contenga dos funciones de nombre suma que hagan lo
	 * siguiente:
	 * 
	 * a. La primera de las funciones recibirá dos argumentos de tipo entero y
	 * devolverá la suma de ambos. El valor a devolver también será entero.
	 * 
	 * b. La segunda de las funciones recibirá dos argumentos de tipo double y
	 * devolverá la suma de ambos. El tipo a devolver debe ser también double.
	 */
	
	/**
	 * funcion para sumar 2 valores enteros
	 * 
	 * @param num1 entero 1
	 * @param num2 entero 2
	 * @return devuelve la suma de los 2 numeros enteros
	 */
	static int suma (int num1, int num2) {
		
		// devolvemos la suma de los enteros
		return num1 + num2;
	}
	
	/**
	 * funcion para sumar los 2 valor decimales
	 * 
	 * @param num1 numero decimal 1
	 * @param num2 numero decimal 2
	 * @return devuelve la suma de los 2 numeros decimales
	 */
	static double suma (double num1, double num2) {
		
		// devolvemos la suma de los enteros
		return num1 + num2;
	}
}
