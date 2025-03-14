package crud.alumno;

import java.util.Objects;

public class Alumno {

	private String nombre = "Anonimo";

	private double nota = 0;

	public Alumno(String nombre, double nota) {

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (nota > 0) {
			this.nota = nota;
		}

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	public double getNota() {
		return this.nota;
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
	public int hashCode() {
		return Objects.hash(nombre, nota);
	}

	@Override
	public boolean equals(Object obj) {
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	
	

}
