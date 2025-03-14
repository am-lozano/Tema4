package examen;

import java.util.Objects;

public class Empleado {

	/**
	 * dni del empleado
	 */
	private String dni;																			

	/**
	 * nombre del empleado
	 */
	private String nombre;

	/**
	 * sueldo base del empleado
	 */
	private double sueldoBase;

	/**
	 * horas extras que realiza el empleado
	 */
	private int horasExtras;

	/**
	 * importe anadido por las horas extras realizadas
	 */
	private static double importeHorasExtras;

	/**
	 * constructor para asignar valores a los atributos
	 * 
	 * @param dni         dni de la empleado
	 * @param nombre      nombre de la empleado
	 * @param sueldoBase  sueldo base de la empleado
	 * @param horasExtras horas extras del empleado
	 */
	public Empleado(String dni, String nombre, double sueldoBase, int horasExtras) {

		if (dni != null && !dni.isEmpty()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}

		if (horasExtras > 0) {
			this.horasExtras = horasExtras;
		}

	}

	/**
	 * metodo get para obtener el dni del empleado
	 * 
	 * @return dni del empleado
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * metodo get para obtener el nombre del empleado
	 * 
	 * @return nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * metodo set para establecer un valor al nombre del empleado
	 * 
	 * @param nombre del empleado
	 */
	public void setNombre(String nombre) {
		
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * metodo get para obtener el sueldo base del empleado
	 * 
	 * @return sueldo base del empleado
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * metodo set para establecer un valor al sueldo base del empleado
	 * 
	 * @param sueldo base del empleado
	 */
	public void setSueldoBase(double sueldoBase) {

		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}
	}

	/**
	 * metodo get para obtener las horas extras del empleado
	 * 
	 * @return horas extras del empleado
	 */
	public int getHorasExtras() {
		return horasExtras;
	}

	/**
	 * metodo set para establecer un valor a las horas extras del empleado
	 * 
	 * @param horas extras del empleado
	 */
	public void setHorasExtras(int horasExtras) {

		if (horasExtras > 0) {
			this.horasExtras = horasExtras;
		}
	}

	/**
	 * metodo get para obtener el importe anadido por las horas extras realizadas
	 * del empleado
	 * 
	 * @return importe anadido al sueldo del empleado
	 */
	public static double getImporteHorasExtras() {
		return importeHorasExtras;
	}

	/**
	 * metodo set para establecer un valor al importe anadido por las horas extras
	 * del empleado
	 * 
	 * @param importe anadio al empleado
	 */
	public static void setImporteHorasExtras(double importeHorasExtras) {
		Empleado.importeHorasExtras = importeHorasExtras;
	}

	/**
	 * metodo para calcular el andido al sueldo del empleado por las horas extras
	 * 
	 * @return multiplicacion del numero de horas realizadas por el empleado por el
	 *         importe de las horas extras
	 */
	public double calcularComplemento() {

		return horasExtras * importeHorasExtras;
	}

	/**
	 * metodo para calcular el sueldo total del empleado
	 * 
	 * @return sueldo total del empleado
	 */
	public double sueldoBruto() {

		return sueldoBase + calcularComplemento();
	}

	/**
	 * sobreescribimos el metodo toString de la calse Objects
	 * 
	 */
	@Override
	public String toString() {

		return dni + " " + nombre + "\n" + "Horas Extras: " + horasExtras + "\n" + "Sueldo Bruto: " + sueldoBruto() + "\n";
	}
	
	/**
	 * sobreescribimos el metodo equals de la calse Objects
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		
		boolean res = false;
		
		Empleado nuevoEmp = (Empleado) obj;
		
		if (this.dni.equalsIgnoreCase(nuevoEmp.dni)) {
			
			res = true;
		}
		
		return res;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	
	

}
