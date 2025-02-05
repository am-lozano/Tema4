package parte1.ej1;

public class Punto {

	/*
	 * Crea un programa con una clase llamada Punto que representará un punto de dos
	 * dimensiones en un plano. Solo contendrá dos atributos enteros llamados x e y
	 * (coordenadas).
	 */

	/*
	 * Añade a la clase Punto un constructor con parámetros que copie las
	 * coordenadas pasadas como argumento a los atributos del objeto.
	 */

	// atributos de la calse punto, representan las coordenadas de los ejes
	// cartesianos de algun punto en el espacio
	int x;
	int y;
	
	/**
	 * Constructro de la calse Punto
	 * 
	 * @param x coordenada del eje X
	 * @param y coordenada del eje Y
	 */
	public Punto (int x, int y) {
		
		this.x = x;
		this.y = y;
	}

}
