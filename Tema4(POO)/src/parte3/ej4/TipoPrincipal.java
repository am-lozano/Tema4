package parte3.ej4;

public class TipoPrincipal {

	public static void main(String[] args) {
		
		// comprobamos si el numero es 1 o 0
		System.out.println(Tipo.parseToBoolean(1));
		System.out.println(Tipo.parseToBoolean(0));
		
		System.out.println();
		
		// comprobamos si la cadena es "true" o "false"
		System.out.println(Tipo.parseToBoolean("true"));
		System.out.println(Tipo.parseToBoolean("false"));
	}

}
