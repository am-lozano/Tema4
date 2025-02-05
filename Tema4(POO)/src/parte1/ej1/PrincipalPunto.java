package parte1.ej1;

public class PrincipalPunto {

	public static void main(String[] args) {

		/*
		 * Crea un programa con una clase llamada Punto que representará un punto de dos
		 * dimensiones en un plano. Solo contendrá dos atributos enteros llamados x e y
		 * (coordenadas).
		 * 
		 * En el main de la clase principal instancia 3 objetos Punto con las
		 * coordenadas (5,0), (10,10) y (-3,7). Muestra por pantalla sus coordenadas
		 * (utiliza un println para cada punto). Modifica todas las coordenadas (prueba
		 * distintos operadores como = + - += *=...) y vuelve a imprimirlas por
		 * pantalla.
		 */

		/*
		 * Corrige el main y utiliza el constructor con parámetros para instanciar los
		 * objetos, pasándole como argumento los valores deseados.
		 */

		/*
		 * Corrige el main para utilizar los getters y setters. Prueba a instanciar
		 * varios objetos, mostrar sus valores por pantalla, modificarlos, etc.
		 */

		// instaciamos los puntos
		Punto A = new Punto(5, 0);
		Punto B = new Punto(10, 10);
		Punto C = new Punto(-3, 7);

		// mostramos las coordenadas
		System.out.println("Punto A: (" + A.getX() + ", " + A.getY() + ")");
		System.out.println();
		System.out.println("Punto B: (" + B.getX() + ", " + B.getY() + ")");
		System.out.println();
		System.out.println("Punto C: (" + C.getX() + ", " + C.getY() + ")");

	}

}
