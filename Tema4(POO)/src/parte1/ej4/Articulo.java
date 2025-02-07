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

	/*
	 * Aplica el encapsulamiento básico a la clase Articulo: Declara todos sus
	 * atributos como private y crea todos los getters y setters necesarios (un get
	 * y un set por atributo). Programa los setters para que comprueben los valores
	 * y los guarden en el objeto solo si son correctos.
	 */

	// atributos de la clase Articulo
	private String nombre;
	private double precio;
	final double IVA = 21;
	private int cuantosQuedan;

	/**
	 * 
	 * constructor para comprobar los datos y asignarles un valor a los atributos
	 * 
	 * @param nombre        nombre del producto
	 * @param precio        precio del producto
	 * @param IVA           impuesto que se aplica al precio del producto
	 * @param cuantosQuedan cantidad de articulos que quedan en el almacen
	 */
	public Articulo(String nombre, double precio, double IVA, int cuantosQuedan) {

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

	/**
	 * metodo get para obtener el valor del nombre
	 * 
	 * @return devuelve el valor del nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * metodo set para establecer un valor al nombre
	 * 
	 * @param nombre nombre del articulo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * metodo get para obtener el valor del precio
	 * 
	 * @return devuelve el valor del precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * metodo set para establecer un valor un valor al precio
	 * 
	 * @param precio precio del articulo
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * metodo get para obtener el valor de cuantos quedan
	 * 
	 * @return devuelve el valor de cuantos productos quedan
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	
	comprobar datos introducidos

	/**
	 * metodo set para establecer un valor de cuantos quedan
	 * 
	 * @param cuantosQuedan numero de articulos que quedan
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * metodo get para obtener el valor del IVA
	 * 
	 * @return devuelve el valor del IVA
	 */
	public double getIVA() {
		return IVA;
	}
	
}
