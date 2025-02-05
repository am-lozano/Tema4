package parte1.ej4;

public class Articulo {

	/*
	 * Crea un programa con una clase llamada Articulo con los siguientes atributos:
	 * nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa
	 * cuántos quedan en el almacén).
	 */

	/*
	 * Añade un constructor con 4 parámetros que asigne valores a nombre, precio,
	 * iva y cuantosQuedan. Dicho constructor deberá comprobar que los datos
	 * introducidos son válidos, modificando el valor del atributo cuando el valor
	 * de entrada sea válido y dejándolo con el valor por defecto cuando no lo es.
	 */

	// atributos de la clase Articulo
	String nombre;
	double precio;
	final double IVA = 21;
	int cuantosQuedan;

	/**
	 * 
	 * constructor para comprobar los datos y asignarles un valor a los atributos
	 * 
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 * @param IVA impuesto que se aplica al precio del producto
	 * @param cuantosQuedan cantidad de articulos que quedan en el almacen
	 */
	public Articulo (String nombre, double precio, double IVA, int cuantosQuedan) {
		
		if (nombre != null && !nombre.isEmpty()) {
			
			this.nombre = nombre;
		}
		
		if (precio > 0) {
			
			this.precio = precio;
		}
		
		if (cuantosQuedan >= 0) {
			
			this.cuantosQuedan = cuantosQuedan;
		}
	}
}
