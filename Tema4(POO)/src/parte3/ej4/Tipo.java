package parte3.ej4;

public class Tipo {

	/*
	 * La primera de las funciones recibirá un argumento de tipo entero que devuelva
	 * false si el argumento es 0 y true si el argumento es 1.
	 * 
	 * La segunda de las funciones recibirá un argumento de tipo String que devuelva
	 * false si la cadena es igual a “false” y true si la cadena es igual a “true”.
	 * 
	 */

	/**
	 * funcion para saber si el numero introducido es 1 o 0
	 * 
	 * @param num numero 1 o 0
	 * @return true o false segun el valor del numero "num" introducido
	 */
	static boolean parseToBoolean(int num) {

		// variable para devolver "true" o "false" segun el numero introducido
		boolean tipoDato = false;

		// comprobamos el valor del numero
		if (num == 1) {
			tipoDato = true;

		}

		return tipoDato;
	}

	/**
	 * funcion para saber si la cadena introducida es "true" o "false"
	 * 
	 * @param valor cadena introducida (true o false)
	 * @return true o false segun  el valor de la cadena "valor" introducida
	 */
	static boolean parseToBoolean(String valor) {
		
		// variable para devolver "true" o "false" segun el numero introducido
		boolean tipoDato = false;
		
		// comprobamos la cadena
		if (valor.toLowerCase().equals("true")) {
			tipoDato = true;
		}
		
		return tipoDato;
	}

}
