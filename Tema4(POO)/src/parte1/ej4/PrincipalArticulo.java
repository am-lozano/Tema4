package parte1.ej4;

public class PrincipalArticulo {

	public static void main(String[] args) {

		/*
		 * En el main de la clase principal instancia un objeto de la clase artículo.
		 * Asígnale valores a todos sus atributos (los que quieras) y muestra por
		 * pantalla un mensaje del estilo “Pijama - Precio:10€ - IVA:21% - PVP:12,1€”
		 * (el PVP es el precio de venta al público, es decir, el precio con IVA).
		 * Luego, cambia el precio y vuelve a imprimir el mensaje.
		 */

		/*
		 * Corrige el main y prueba a crear varios artículos. Introduce algunos con
		 * valores incorrectos para comprobar qué ocurre.
		 */

		// instanciamos un objeto de la clase Articulo
		Articulo art1 = new Articulo("Lata", 5.20, 21, 2);
		Articulo art2 = new Articulo("", 5.20, 21, 2);
		Articulo art3 = new Articulo("Yogurt", -2, 21, 2);
		Articulo art4 = new Articulo("Avena", 5.20, 21, -2);

		// mostramos el mensaje
		System.out.println(art1.getNombre() + " - " + "Precio:" + art1.getNombre() + "€ - IVA:" + art1.getIVA() + "% - PVP:"
				+ (art1.getPrecio() * (art1.getIVA() / 100)));
		System.out.println();
		
		// comprobamos el dato String (nombre del producto)
		System.out.println(art2.getNombre() + " - " + "Precio:" + art2.getPrecio() + "€ - IVA:" + art2.getIVA() + "% - PVP:"
				+ (art2.getPrecio() * (art2.getIVA() / 100)));
		System.out.println();
		
		// comprobamos el dato del precio
		System.out.println(art3.getNombre() + " - " + "Precio:" + art3.getPrecio() + "€ - IVA:" + art3.getIVA() + "% - PVP:"
				+ (art3.getPrecio() * (art3.getIVA() / 100)));
		System.out.println();
		
		// comprobamos el dato de cuantos quedan
		System.out.println(art4.getNombre() + " - " + "Precio:" + art4.getPrecio() + "€ - IVA:" + art4.getIVA() + "% - PVP:"
				+ (art4.getPrecio() * (art4.getIVA() / 100)));
		System.out.println();

	}

}
