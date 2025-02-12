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
	private String nombre = "nombre predefinido";

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
	public CuentaCorriente(String nombre, String dni, double saldo) {

		if (dni != null && !dni.isEmpty()) { // comprobamos que los datos son correctos
			this.dni = dni;
		}

		if (nombre != null && !nombre.isEmpty()) { // comprobamos que los datos son correctos
			this.nombre = nombre;
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
	public CuentaCorriente(String nombre, String dni, double saldo, Nacionalidad nacionalidad) {

		if (dni != null && !dni.isEmpty()) { // comprobamos que los datos son correctos
			this.dni = dni;
		}

		if (nombre != null && !nombre.isEmpty()) { // comprobamos que los datos son correctos
			this.nombre = nombre;
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
			this.nombre = nombre;
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

	/**
	 * funcion para saber si la cantidad de dinero es suficiente para realizar la
	 * operacion de sacar dinero de la cuenta
	 * 
	 * @param cantidadSacada cantidad de dinero que se quiere sacar
	 * @return true -> se puede sacar la cantidad deseada; false-> no se puede sacar
	 *         la cantidad deseada
	 */
	public boolean sacarDinero(double cantidadSacada) {

		// variable para saber si se puede sacar dinero de la cuenta
		boolean operacion = false;

		// comprobamos que la cantidad de dinero que se quiere sacar es menor o igual a
		// la cantidad de saldo en la cuenta
		if (cantidadSacada <= saldo) {

			saldo -= cantidadSacada; // si se puede realizar la operacion restamos la cantidad a sacar del saldo de
			// la cuenta

			operacion = true; // inicializamos "operacion" a true porque la operacion se ha podido realizar
								// correctamente

		}

		return operacion;

	}

	/**
	 * funion para comprobar si se ha podido ingresar correctamente el dinero
	 * deseado en la cuenta
	 * 
	 * @param cantidadIngresada cantidad de dinero que se quiere ingresar en la
	 *                          cuenta
	 * @return devuelve true en caso de poder introducir el dinero, false en caso
	 *         contrario
	 */
	public boolean ingresarDinero(double cantidadIngresada) {

		// variable para saber si se puede ingresar la cantidad de dinero introducido
		boolean operacion = false;

		// comprobamos que la cantidad de dinero que se quiere introducir es positiva
		// para poder anadirlo en la cuenta
		if (cantidadIngresada > 0) {

			// si se puede anadir la cantidad de dinero se la sumamos al saldo de la cuenta
			saldo += cantidadIngresada;

			operacion = true; // inicializamos "operacion" a true porque la operacion se ha podido realizar
								// correctamente
		}

		// devolvemos si se ha podido ingresar la cantidad de dinero o no
		return operacion;

	}

	/**
	 * funcion para mostrar la informacion de la cuenta de la persona
	 * 
	 * @return cadena con la informacion de la persona
	 */
	@Override
	public String toString() {

		// cadena con la informacion de la cuenta corriente
		String cad;

		cad = "Persona: " + nombre + ", con DNI: " + dni + "\n" + "Saldo: " + saldo;

		return cad;
	}

	/**
	 * funcion para comprobar si 2 cuentas son iguales, para ello comprobaremos si
	 * el DNI y el nombre son iguales
	 * 
	 * @return devuelve true si las cuentas son iguales (mismo DNI y nombre), false
	 *         en caso contrario
	 */
	@Override
	public boolean equals(Object obj) {

		// variables para saber si 2 cuentas son iguales
		boolean iguales = false;

		// hacemos un cast
		CuentaCorriente cuenta2 = (CuentaCorriente) obj;

		// comprobamos si los nombre son iguales y los DNIs son iguales
		if (this.nombre.equals(cuenta2.nombre) && this.dni.equals(cuenta2.dni)) {
			
			// si los nombres y los DNIs son iguales inicializamos la variabe "iguales" a true
			iguales = true;
			
		}

		// devolvemos si las cuentas son iguales
		return iguales;
	}
}
