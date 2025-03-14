package crud.alumno;

import java.util.ArrayList;

public class AlumnoCRIUD {
	
	private static ArrayList<Alumno> lista = new ArrayList<Alumno>();
	
	public static void mostrarLista () {
		
		for (Alumno a : lista) {
			
			System.out.println(a);
		}
	}
	
	public static boolean anadirAlum (Alumno alum) {
		return lista.add(alum);
	}
	
	public static boolean modificarAlum (Alumno al, double mediaNueva) {
		
		boolean res = false;
		
		Alumno alumno = buscarAlumno(al);
		
		if(alumno != null) {
			alumno.setNota(mediaNueva);	
			res = true;
		}
		
		return res;
	}
	
	public static boolean eliminarAlum (Alumno alum) {
		return lista.remove(alum);
	}
	
	private static Alumno buscarAlumno(Alumno al) {
		 
		Alumno alumn = null;
		
		for(Alumno alumno : lista) {
			if(alumno.equals(al)) {
				alumn = alumno;
			}
		}
		
		return alumn;
	}
	
	
	
}