package parte2.alumno;

public class Alumno {

	private String nombre;

	private double nota;

	public Alumno(String nombre, double nota) {

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (nota > 0) {
			this.nota = nota;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if (nota > 0) {
			this.nota = nota;
		}
	}

	@Override
	public String toString() {
		return nombre + " " + nota;
	}

	@Override
	public boolean equals(Object obj) {

		boolean iguales = false;
		
		Alumno alumNuevo = (Alumno) obj;
		
		if (this.nombre.equals(alumNuevo.nombre)) {
			iguales = true;
		}
		
		return iguales;
	}

}
