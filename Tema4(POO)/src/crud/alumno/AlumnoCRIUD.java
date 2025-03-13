package crud.alumno;

import java.util.ArrayList;

public class AlumnoCRIUD {
	
	static ArrayList<Alumno> lista = new ArrayList<Alumno>();
	
	public static void mostrarLista () {
		
		for (Alumno a : lista) {
			
			System.out.println(a);
		}
	}
	
	public static boolean anadirAlum (Alumno alum) {
		return lista.add(alum);
	}
	
	public static boolean modificarAlum (String nombre, double media) {
		
		boolean res = false;
		
		Alumno alumno = buscarAlumno(nombre);
		
		if(alumno != null) {
			alumno.setNota(media);	
			res = true;
		}
		
		return res;
	}
	
	public static boolean eliminarAlum (Alumno alum) {
		return lista.remove(alum);
	}
	
	private static Alumno buscarAlumno(String nombre) {
		 
		Alumno alumn = null;
		
		for(Alumno alumno : lista) {
			if(alumno.getNombre().equalsIgnoreCase(nombre)) {
				alumn = alumno;
			}
		}
		
		return alumn;
	}
	
}