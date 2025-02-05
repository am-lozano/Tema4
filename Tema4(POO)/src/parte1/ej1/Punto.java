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

	public int getX() {
		
		return x;
	}

	public void setX(int x) {
		
		this.x = x;
	}

	public int getY() {
		
		return y;
	}

	public void setY(int y) {
		
		this.y = y;
	}

	
}
