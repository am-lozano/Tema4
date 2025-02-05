package parte1.ej3;

public class Rectangulo {

	/*
	 * Crea un programa con una clase llamada Rectangulo que representará un
	 * rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que
	 * la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2.
	 */

	/*
	 * En nuestro software necesitamos asegurarnos de que la coordenada (x1,y1)
	 * represente la esquina inferior izquierda y la (x2,y2) la superior derecha del
	 * rectángulo, como en el dibujo.
	 * 
	 * Añade a Rectangulo un constructor con los 4 parámetros. Incluye un if que
	 * compruebe los valores. Si son válidos guardará los parámetros en el objeto.
	 * En caso contrario, los atributos se quedarán con los valores por defecto.
	 * 
	 */

	// atributos de la clase Rectangulo para la coordenada x
	int x1;
	int x2;

	// atributos de la clase Rectangulo para la coordenada y
	int y1;
	int y2;
	
	/**
	 * Constructor para comprobar que los datos son correctos
	 * 
	 * @param x1 coordenada X del primer punto
	 * @param x2 coordenada X del segundo punto
	 * @param y1 coordenada Y del primer punto
	 * @param y2 coordenada Y del segundo punto
	 */
	public Rectangulo (int x1, int x2, int y1, int y2) {
		
		if (x2 > x1) { // comprobamos que los datos introducidos son correctos
			
			this.x1 = x1;
			this.x2 = x2;
		}
		
		if (y2 > y1) { // comprobamos que los datos introducidos son correctos
			
			this.y1 = y1;
			this.y2 = y2;
		}
	}
}
