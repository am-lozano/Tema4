package parte2.pizza;

public class Pizza {

	/**
	 * codigo de la pizza
	 */
	private int cod;

	/**
	 * tamano de la pizza
	 */
	private Tamano tamano;

	/**
	 * tipo de la pizza
	 */
	private Tipo tipo;

	/**
	 * estado de la pizza
	 */
	private Estado estado = Estado.PEDIDA;

	enum Tamano {
		MEDIANA, FAMILIAR
	}

	enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	}

	enum Estado {
		PEDIDA, SERVIDA
	}

	/**
	 * constructor para crear una pizza
	 * 
	 * @param cod codigo de la pizza
	 * @param tamano tamano de la pizza
	 * @param tipo tipo de la pizza
	 */
	public Pizza(int cod, String tamano, String tipo) {

		if (cod >= 0) {

			this.cod = cod;
		}

		if (tamano != null) {

			switch (tamano.toUpperCase()) {

			case "MEDIANA" -> this.tamano = Tamano.MEDIANA;

			case "FAMILIAR" -> this.tamano = Tamano.FAMILIAR;

			}
		}

		if (tipo != null) {

			switch (tipo.toUpperCase()) {

			case "MARGARITA" -> this.tipo = Tipo.MARGARITA;
			case "CUATROQUESOS" -> this.tipo = Tipo.CUATROQUESOS;
			case "FUNGHI" -> this.tipo = Tipo.FUNGHI;

			}
		}
	}

	/**
	 * metodo get para obtener el codigo de la pizza
	 * 
	 * @return codigo de la pizza
	 */
	public int getCod() {
		return cod;
	}

	/**
	 * metodo set para establecer el codigo de la pizza
	 * @param cod
	 */
	public void setCod(int cod) {

		if (cod >= 0) {

			this.cod = cod;
		}
	}

	/**
	 * metodo get para obtener el estado de la pizza
	 * 
	 * @return estado de la pizza
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * metodo get para obtener el tamano de la pizza
	 * 
	 * @return tamano de la pizza
	 */
	public Tamano getTamano() {
		return tamano;
	}

	/**
	 * metodo get para obtener el tipo de la pizza
	 * 
	 * @return tipo de la pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}
	
	@Override
	public String toString() {
		
		return cod + ": " + tamano + " - " + tipo + " - " + estado;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean res = false;
		
		Pizza otraPizza = (Pizza) obj;
		
		if (this.cod == otraPizza.cod) {
			
			res = true;
			
		}
		
		return res;
	}

}
