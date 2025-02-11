package parte2.cuenta;

public class CuentaCorriente {

	/*
	 * Diseñar la clase CuentaCorriente, que almacena los datos DNI, nombre, saldo y
	 * nacionalidad, el cual tendrá 2 valores: Española y Extranjera.
	 * 
	 * Añade los siguientes constructores:
	 * 
	 * Con el DNI del titular de la cuenta y un saldo inicial.
	 * 
	 * Con el DNI, nombre y el saldo inicial.
	 * 
	 * Con el DNI, nombre, el saldo inicial y nacionalidad.
	 * 
	 * Añade los getters/setters que consideres oportunos.
	 * 
	 * Las operaciones típicas de una cuenta corriente son:
	 * 
	 * Sacar dinero: se extraerá una cantidad de dinero introducida por parámetro.
	 * Sólo se puede sacar dinero si existe saldo suficiente. Si es posible llevar a
	 * cabo la operación se resta la cantidad a sacar al saldo de la cuenta y
	 * devolverá true. En caso contrario, no se podrá sacar dinero y devolverá
	 * false.
	 * 
	 * Ingresar dinero: se incrementa el saldo. Hay que comprobar que el saldo a
	 * ingresar es una cantidad positiva. Devolverá true si se puede llevar a cabo
	 * la operación y false en caso contrario.
	 * 
	 * toString: Devuelve una cadena con la información de la cuenta corriente.
	 * 
	 * equals: Dos cuentas corrientes se consideran iguales si coinciden el DNI y el
	 * nombre.
	 * 
	 */

	/**
	 * enumerado para la nacionalidad de la persona a la que pertene la cuenta
	 * corriente
	 */
	enum Nacionalidad {
		ESPANOLA, EXTRANJERA
	}

	Nacionalidad nacionalidad = Nacionalidad.ESPANOLA;

	/**
	 * DNI de la persona a la que pertene la cuenta corriente
	 */
	private String dni;

	/**
	 * nombre de la persona a la que pertene la cuenta corriente
	 */
	private String nombre;

	/**
	 * saldo de la persona a la que pertene la cuenta corriente
	 */
	private double saldo;

	/**
	 * 
	 * @param dni
	 * @param saldo
	 */
	public CuentaCorriente(String dni, double saldo) {

		if (dni != null && !dni.isEmpty()) { // comprobamos que los datos son correctos
			this.dni = dni;
		}

		if (saldo > 100) {
			this.saldo = saldo;
		}
	}

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {

		if (dni != null && !dni.isEmpty()) { // comprobamos que los datos son correctos
			this.dni = dni;
		}

		if (nombre != null && !nombre.isEmpty()) { // comprobamos que los datos son correctos
			this.dni = dni;
		}

		if (saldo > 100) {
			this.saldo = saldo;
		}
	}

	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 * @param nacionalidad
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, Nacionalidad nacionalidad) {

		if (dni != null && !dni.isEmpty()) { // comprobamos que los datos son correctos
			this.dni = dni;
		}

		if (nombre != null && !nombre.isEmpty()) { // comprobamos que los datos son correctos
			this.dni = dni;
		}

		if (saldo > 100) {
			this.saldo = saldo;
		}

		switch (nacionalidad) { // comprobamos los datos

		case ESPANOLA -> nacionalidad = Nacionalidad.ESPANOLA;

		case EXTRANJERA -> nacionalidad = Nacionalidad.EXTRANJERA;

		default -> nacionalidad = Nacionalidad.EXTRANJERA;

		}
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {

		switch (nacionalidad) { // comprobamos los datos

		case ESPANOLA -> nacionalidad = Nacionalidad.ESPANOLA;

		case EXTRANJERA -> nacionalidad = Nacionalidad.EXTRANJERA;

		default -> nacionalidad = Nacionalidad.EXTRANJERA;

		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {

		if (dni != null && !dni.isEmpty()) { // comprobamos que los datos son correctos
			this.dni = dni;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if (nombre != null && !nombre.isEmpty()) { // comprobamos que los datos son correctos
			this.dni = dni;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {

		if (saldo > 100) {
			this.saldo = saldo;
		}
	}

	/*
	 * Sacar dinero: se extraerá una cantidad de dinero introducida por parámetro.
	 * Sólo se puede sacar dinero si existe saldo suficiente. Si es posible llevar a
	 * cabo la operación se resta la cantidad a sacar al saldo de la cuenta y
	 * devolverá true. En caso contrario, no se podrá sacar dinero y devolverá
	 * false.
	 */
	
//	public boolean sacarDinero
}
