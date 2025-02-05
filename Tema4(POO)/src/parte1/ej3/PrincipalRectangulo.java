package parte1.ej3;

public class PrincipalRectangulo {

	public static void main(String[] args) {

		/*
		 * Crea un programa con una clase llamada Rectangulo que representará un
		 * rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que
		 * la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2.
		 * 
		 * En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5)
		 * y (7,9)(2,3). Muestra por pantalla sus coordenadas, perímetros (suma de
		 * lados) y áreas (ancho x alto). Modifica todas las coordenadas como consideres
		 * y vuelve a imprimir coordenadas, perímetros y áreas.
		 */

		// instanciamos 2 objetos Rectangulo
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();
		
		// variable para almacenar la medida de la base del rectangulo
		int base;
		
		// variable para almacenar la altura del rectangulo
		int altura;

		// asignamos las coordenadas al primer objeto (rectangulo 1)
		rec1.x1 = 0;
		rec1.y1 = 0;

		rec1.x2 = 5;
		rec1.y2 = 5;

		// asignamos las coordenadas al segundo objeto (rectangulo 2)
		rec2.x1 = 7;
		rec2.y1 = 9;

		rec2.x2 = 2;
		rec2.y2 = 3;

		// mostramos las coordenadas
		System.out.println(
				"Rectangulo 1:" + "(" + rec1.x1 + ", " + rec1.x2 + ") " + "(" + rec1.y1 + ", " + rec1.y2 + ")");
		System.out.println();
		
		// calculamos cual es la longitud de la base y de la altura del rectangulo
		base = Math.abs(rec1.x2 - rec1.x1);
		altura = Math.abs(rec1.y2 - rec1.y1);
		
		// calculamos el perimetro y lo imprimimos, para ello calcularemos cuanto mide la altura y la base del rectangulo
		System.out.println("Perimetro rectangulo 1: " + (base * 2 + altura * 2) + " cm");
		System.out.println("Area rectangulo 1: " + (base * altura) + " cm²");
		
		System.out.println();
		
		// mostramos las coordenadas
		System.out.println(
				"Rectangulo 2:" + "(" + rec2.x1 + ", " + rec2.x2 + ") " + "(" + rec2.y1 + ", " + rec2.y2 + ")");
		System.out.println();
		
		// calculamos cual es la longitud de la base y de la altura del rectangulo
		base = Math.abs(rec2.x2 - rec2.x1);
		altura = Math.abs(rec2.y2 - rec2.y1);
		
		// calculamos el perimetro y lo imprimimos, para ello calcularemos cuanto mide la altura y la base del rectangulo
		System.out.println("Perimetro rectangulo 1: " + (base * 2 + altura * 2) + " cm");
		System.out.println("Area rectangulo 1: " + (base * altura) + " cm²");
		
		Math.abs(rec2.y2 - rec2.y2);
		Math.abs(rec2.x2 - rec2.x2);
		
		

	}

}
