package examen;

import java.util.ArrayList;

public class ListadoEmpleado {
	
	/*
	 * Añadir empleado.
	 * Listar empleados.
	 * Modificar horas extra.
	 * Modificar importe horas extra.
	 * Eliminar empleado.
	 * Salir.
	 */
	
	private static ArrayList<Empleado> lista = new ArrayList<Empleado>();
	
	/**
	 * metodo para anadir un nuevo empleado a la lista
	 * 
	 * @param e empleado a anadir en la coleccion
	 * @return true si se ha anadido correctamente, false si no se ha anadido
	 */
	public boolean nuevoEmpleado (Empleado emp) {
		
		return lista.add(emp);
	}
	
	/**
	 * metodo para mostrar los empleados de la lista
	 */
	public void listarEmpleado() {
		
		for (Empleado e : lista) {
			
			System.out.println(e);
		}
	}
	
	/**
	 * metodo para modificar las horas extras del empleado
	 * 
	 * @return true si se ha modificado correctamente, false si no se ha modificado
	 */
	public boolean modificarHoras(String dni, int horas) {
		
		return true;
	}
	
	/**
	 * metodo para modificar el importe por horas extras
	 * 
	 * @param importe nuevo importe de las horas extras
	 * @return true si se ha modificado correctamente, false si no se ha modificado
	 */
	public boolean modificarImporte(double importe) {
		
		boolean res = false;
		
		double importeInicial = Empleado.getImporteHorasExtras();
		
		Empleado.setImporteHorasExtras(importe);
		
		if (importeInicial != Empleado.getImporteHorasExtras()) {
			res = true;
		}
		
		return res;
	}
	
	/**
	 * metodo para eliminar un empleado con dni X de la lista
	 * 
	 * @param emp
	 * @return true si se ha eliminado correctamente, false si no se ha modificado
	 */
	public boolean eliminarEmpleado(Empleado emp) {
		
		return lista.remove(emp);
	}

}
