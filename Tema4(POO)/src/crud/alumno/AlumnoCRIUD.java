package crud.alumno;

import java.util.HashSet;
import java.util.Set;

public class AlumnoCRIUD {
	
	private static Set<Alumno> lista = new HashSet<Alumno>();
	
	public static void mostrarLista () {
		
		for (Alumno a : lista) {
			
			System.out.println(a);
		}
	}
	
	public static boolean anadirAlum (Alumno alum) {
		return lista.add(alum);
	}
	
	public static boolean modificarAlum (String nombre, double media, double mediaNueva) {
		
		boolean res = false;
		
		Alumno alumno = buscarAlumno(nombre, media);
		
		if(alumno != null) {
			alumno.setNota(mediaNueva);	
			res = true;
		}
		
		return res;
	}
	
	public static boolean eliminarAlum (Alumno alum) {
		return lista.remove(alum);
	}
	
	private static Alumno buscarAlumno(String nombre, double media) {
		 
		Alumno alumn = null;
		
		for(Alumno alumno : lista) {
			if(alumno.getNombre().equalsIgnoreCase(nombre) && alumno.getNota() == media) {
				System.out.println(alumn);
				alumn = alumno;
				System.out.println(alumn);
			}
		}
		
		return alumn;
	}
	
	
	
}