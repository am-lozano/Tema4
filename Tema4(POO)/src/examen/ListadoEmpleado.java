package examen;

import java.util.HashSet;
import java.util.Set;

public class ListadoEmpleado {

	/*
	 * Añadir empleado. Listar empleados. Modificar horas extra. Modificar importe
	 * horas extra. Eliminar empleado. Salir.
	 */

	private static Set<Empleado> lista = new HashSet<Empleado>();

	/**
	 * metodo para anadir un nuevo empleado a la lista
	 * 
	 * @param e empleado a anadir en la coleccion
	 * @return true si se ha anadido correctamente, false si no se ha anadido
	 */
	public static boolean nuevoEmpleado(Empleado emp) {

		return lista.add(emp);
	}

	/**
	 * metodo para mostrar los empleados de la lista
	 */
	public static void listarEmpleado() {

		for (Empleado e : lista) {

			System.out.println(e);
		}
	}

	/**
	 * metodo para modificar las horas extras del empleado
	 * 
	 * @return true si se ha modificado correctamente, false si no se ha modificado
	 */
	public static boolean modificarHoras(String dni, int horas) {

		boolean res = false;
		
		Empleado emp = buscarEmpleado(dni);
		
		if (emp != null) {
			
			emp.setHorasExtras(horas);
			res = true;
		}
		
		return res;
	}

	/**
	 * metodo para modificar el importe por horas extras
	 * 
	 * @param importe nuevo importe de las horas extras
	 * @return true si se ha modificado correctamente, false si no se ha modificado
	 */
	public static boolean modificarImporte(double importe) {

		boolean res = false;

		double importeInicial = Empleado.getImporteHorasExtras();

		Empleado.setImporteHorasExtras(importe);

		if (importeInicial != Empleado.getImporteHorasExtras()) {
			res = true;
		}

		return res;
		
//		boolean res = false;
//
//		Empleado emp = buscarEmpleado(dni);
//
//		if (emp != null) {
//
//			emp.setImporteHorasExtras(importe);
//			res = true;
//		}
//
//		return res;
	}

	public static Empleado buscarEmpleado(String dni) {

		Empleado emp = null;

		for (Empleado e : lista) {

			if (e.getDni().equalsIgnoreCase(dni)) {
				emp = e;
			}
		}

		return emp;
	}

	/**
	 * metodo para eliminar un empleado con dni X de la lista
	 * 
	 * @param emp
	 * @return true si se ha eliminado correctamente, false si no se ha modificado
	 */
	public static boolean eliminarEmpleado(Empleado emp) {

		return lista.remove(emp);
	}

}
