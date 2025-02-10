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

	/*
	 * Modifica los atributos de Punto para que sean private. Fíjate que desde el
	 * main ya no te dejará utilizar ni modificar los atributos x e y de los
	 * objetos.
	 * 
	 * Añade los getters getX() e getY() a la clase Punto. Añade también los setters
	 * setX(int x) y setY(int y). Tanto getters como setters deben ser public.
	 */

	/*
	 * public void setXY(int x, int y): Modifica ambas coordenadas. Es como un
	 * setter doble.
	 * 
	 * public void desplaza(int dx, int dy): Desplaza el punto la cantidad (dx,dy)
	 * indicada. Ejemplo: Si el punto (1,1) se desplaza (2,5) entonces estará en
	 * (3,6).
	 * 
	 * public double distancia(Punto p): Calcula y devuelve la distancia entre el
	 * propio objeto (this) y otro objeto (Punto p) que se pasa como parámetro.
	 * Prueba a utilizar estos métodos desde el main para comprobar su
	 * funcionamiento. (NOTA: distancia entre dos coordenadas).
	 * 
	 * public String toString(): Devuelve una cadena con los valores de las
	 * coordenadas. Ejemplo: “(7, -5)”
	 * 
	 */

	private int x;
	private int y;

	/**
	 * Constructro de la calse Punto
	 * 
	 * @param x coordenada del eje X
	 * @param y coordenada del eje Y
	 */
	public Punto(int x, int y) {

		this.x = x;
		this.y = y;

	}

	/**
	 * metodo get para obtener el valor de la coordenada X
	 * 
	 * @return devuelve el valor de X
	 */
	public int getX() {

		return x;
	}

	/**
	 * metodo set para establecer un valor a X
	 * 
	 * @param x coordenada X
	 */
	public void setX(int x) {

		this.x = x;
	}

	/**
	 * metodo get para obtener el valor de la coordenada Y
	 * 
	 * @return devuelve el valor de Y
	 */
	public int getY() {

		return y;
	}

	/**
	 * metodo set para establecer un valor a Y
	 * 
	 * @param y coordenada Y
	 */
	public void setY(int y) {

		this.y = y;
	}
	
	/**
	 * metodo para asignar unas nuevas coordenas al punto
	 * 
	 * @param x coordenada X del punto
	 * @param y coordenada Y del punto
	 */
	public void setXY(int x, int y) {

		this.x = x;
		this.y = y;
	}

	/**
	 * metodo para desplazar el punto segun las coordenadas indicadas
	 * 
	 * @param dx distancia que se le anade a la coodena X del punto
	 * @param dy distancia que se le anade a la coodena Y del punto
	 */
	public void desplaza(int dx, int dy) {

		this.x = dx + x;
		this.y = dy + y;
	}

	/**
	 * metodo para calcular la distancia entre un punto P y el punto de la clase
	 * 
	 * @param p punto nuevo P
	 * @return devuelve la distancia entre los 2 puntos
	 */
	public double distancia(Punto p) {
		
		return 2;
	}

}
