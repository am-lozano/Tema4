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

	/*
	 * Aplica el encapsulamiento básico a la clase Rectángulo: Declara todos sus
	 * atributos como private y crea todos los getters y setters necesarios (un get
	 * y un set por atributo). Los setters deben comprobar que el valor pasado como
	 * argumento es válido antes de guardarlo.
	 */

	// atributos de la clase Rectangulo para la coordenada x
	private int x1;
	private int x2;

	// atributos de la clase Rectangulo para la coordenada y
	private int y1;
	private int y2;

	/**
	 * Constructor para comprobar que los datos son correctos
	 * 
	 * @param x1 coordenada X del primer punto
	 * @param x2 coordenada X del segundo punto
	 * @param y1 coordenada Y del primer punto
	 * @param y2 coordenada Y del segundo punto
	 */
	public Rectangulo(int x1, int x2, int y1, int y2) {

		if (x2 > x1) { // comprobamos que los datos introducidos son correctos

			this.x1 = x1;
			this.x2 = x2;
		}

		if (y2 > y1) { // comprobamos que los datos introducidos son correctos

			this.y1 = y1;
			this.y2 = y2;
		}
	}

	/**
	 * metodo get para obtener el valor de la coordenada X1
	 * 
	 * @return delvuelve el valor de x1
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * metodo set para establecer un valor a la coordenada x1
	 * 
	 * @param x1
	 */
	public void setX1(int x1) {
		
		if (this.x2 > this.x1 && this.y2 > this.y1) 
		this.x1 = x1;
	}

	/**
	 * metodo get para obtener el valor de la coordenada X2
	 * 
	 * @return devuelve el valor de x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * metodo set para establecer un valor a la coordenada x2
	 * 
	 * @param x2
	 */
	public void setX2(int x2) {
		
		if (this.x2 > this.x1 && this.y2 > this.y1) {
			this.x2 = x2;			
		}
	}

	/**
	 * metodo get para obtener el valor de la coordenada Y1
	 * 
	 * @retur ndevuelve el valor de y1
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * metodo set para establecer un valor a la coordenada y1
	 * 
	 * @param y1
	 */
	public void setY1(int y1) {
		
		if (this.x2 > this.x1 && this.y2 > this.y1) {
			this.y1 = y1;			
		}
	}

	/**
	 * metodo get para obtener el valor de la coordenada Y2
	 * 
	 * @return devuelve el valor de y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * metodo set para establecer un valor a la coordenada y2
	 * 
	 * @param y2
	 */
	public void setY2(int y2) {
		
		if (this.x2 > this.x1 && this.y2 > this.y1) {
			this.y2 = y2;
		}
	}
	
	
}
