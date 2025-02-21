package parte3.ej2;

public class MediaNumeros {

	/*
	 * La primera de las funciones recibirá dos argumentos de tipo entero y
	 * devolverá la media de ambos. El valor a devolver debe ser double.
	 * 
	 * La segunda de las funciones recibirá tres argumentos de tipo entero y
	 * devolverá la media de los tres. El tipo a devolver debe ser double.
	 * 
	 */
	
	/**
	 * funcion para hacer la media de dos numeros enteros
	 * 
	 * @param a primer numero entero
	 * @param b segundo numero entero
	 * @return media de los dos numeros enteros
	 */
	static double media (int a, int b) {
		
		int suma = a + b;
		
		return (double) suma / 2;
	}
	
	/**
	 * funcion para hacer la media de tres numeros enteros
	 * 
	 * @param a primer numero entero
	 * @param b segundo numero entero
	 * @param c tercer numero entero
	 * @return media de los tres numeros enteros
	 */
	static double media (int a, int b, int c) {
		
		int suma = a + b + c;
		
		return (double) suma / 3;
	}

}
