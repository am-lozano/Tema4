package parte2.libro;

public class Libro {

	/**
	 * titulo del libro
	 */
	private String titulo;

	/**
	 * autor del libro
	 */
	private String autor;

	/**
	 * numero de ejemplares del libro
	 */
	private int numEjemplares;

	/**
	 * numero de ejemplares prestados
	 */
	private int numPrestados;

	/**
	 * genero del libro
	 */
	private Tipo genero;

	enum Tipo {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}

	/**
	 * constructor para crear un libro con el titulo y el autor
	 * 
	 * @param titulo titulo del libro
	 * @param autor autor del libro
	 */
	public Libro(String titulo, String autor) {

		if (titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.isEmpty()) {
			this.autor = autor;
		}
	}

	/**
	 * 
	 * constructor para crear un libro con el titulo, el autor, los ejemplares y los libros prestados
	 * 
	 * @param titulo titulo del libro
	 * @param autor autor del libro
	 * @param numEjemplares ejemplares que quedan del libro
	 * @param numPrestados libros prestados
	 */
	public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {

		if (titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.isEmpty()) {
			this.autor = autor;
		}

		if (numEjemplares > 0) {
			this.numEjemplares = numEjemplares;
		}

		if (numPrestados >= 0) {
			this.numPrestados = numPrestados;
		}

	}

	/**
	 * constructor para crear un libro con todos los datos
	 * 
	 * @param titulo titulo del libro
	 * @param autor autor del libro
	 * @param numEjemplares ejemplares que quedan del libro
	 * @param numPrestados libros prestados
	 * @param genero genero del libro
	 */
	public Libro(String titulo, String autor, int numEjemplares, int numPrestados, String genero) {

		if (titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}

		if (autor != null && !autor.isEmpty()) {
			this.autor = autor;
		}

		if (numEjemplares > 0) {
			this.numEjemplares = numEjemplares;
		}

		if (numPrestados >= 0) {
			this.numPrestados = numPrestados;
		}

		if (genero != null && !genero.isEmpty()) {

			switch (genero.toUpperCase()) {

			case "NARRATIVO" -> {
				this.genero = Tipo.NARRATIVO;
			}

			case "LIRICO" -> {
				this.genero = Tipo.LIRICO;
			}

			case "DRAMATICO" -> {
				this.genero = Tipo.DRAMATICO;
			}

			case "DIDACTICO" -> {
				this.genero = Tipo.DIDACTICO;
			}

			case "POETICO" -> {
				this.genero = Tipo.POETICO;
			}
			}
		}
	}

	/**
	 * metodo get para obtener el titulo del libro
	 * 
	 * @return titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * metodo set para establecer un titulo al libro
	 * 
	 * @param titulo titulo del libro
	 */
	public void setTitulo(String titulo) {

		if (titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
	}

	/**
	 * metodo get para obtener el autor del libro
	 * 
	 * @return autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * metodo set para establecer un autor al libro
	 * 
	 * @param autor autor del libro
	 */
	public void setAutor(String autor) {

		if (autor != null && !autor.isEmpty()) {
			this.autor = autor;
		}
	}
	
	/**
	 * metodo get para obtener el numero de ejmplares
	 * 
	 * @return numero de ejemplares
	 */
	public int getNumEjemplares() {
		return numEjemplares;
	}

	/**
	 * metodo set para establecer el numero de ejemplares
	 * 
	 * @param numEjemplares numero de ejemplares
	 */
	public void setNumEjemplares(int numEjemplares) {

		if (numEjemplares > 0) {
			this.numEjemplares = numEjemplares;
		}
	}

	/**
	 * metodo get para obtener el numero de libros prestados
	 * 
	 * @return numero de libros prestados
	 */
	public int getNumPrestados() {
		return numPrestados;
	}

	/**
	 * metodo set para establecer el numero de libros prestados
	 * 
	 * @param numPrestados numero de libros prestados
	 */
	public void setNumPrestados(int numPrestados) {

		if (numPrestados > 0) {
			this.numPrestados = numPrestados;
		}
	}

	/**
	 * metodo get para obtener el genero del libro
	 * 
	 * @return genero del libro
	 */
	public Tipo getGenero() {
		return genero;
	}

	/**
	 * metodo para realizar el prestamo de un libro
	 * 
	 * @return true si se ha realizado correctamente, false en caso contrario
	 */
	public boolean prestamo() {

		boolean res = false;

		if (numEjemplares > 0) {

			numEjemplares--;

			numPrestados++;

			res = true;
		}

		return res;
	}

	/**
	 * metodo para realizar la devolucion de un ejemplar
	 * 
	 * @return true si se ha realizado correctamente, false en caso contrario
	 */
	public boolean devolucion() {

		boolean res = false;

		if (numPrestados <= numEjemplares && numEjemplares > 0) {

			numPrestados--;

			numEjemplares++;

			res = true;

		}

		return res;
	}

	@Override
	public String toString() {

		return "Libro: " + titulo + "\n Autor: " + autor + "\n Genero: " + genero;
	}

	@Override
	public boolean equals(Object obj) {

		boolean res = false;
		
		Libro otroLibro = (Libro) obj;
		
		if (this.autor.equalsIgnoreCase(otroLibro.autor) && this.titulo.equalsIgnoreCase(otroLibro.titulo)) {
			
			res = true;
		}

		return res;
	}

}
