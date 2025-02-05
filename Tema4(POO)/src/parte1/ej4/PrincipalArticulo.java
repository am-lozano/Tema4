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

		// instanciamos un objeto de la clase Articulo
		Articulo art1 = new Articulo();

		// asignamos un valor a los atributos de la clase
		art1.nombre = "Lata";
		art1.precio = 5.20;
		art1.cuantosQuedan = 2;

		// variable para almacenar el pvp (precio de venta al publico)
		double pvp = (art1.precio * (double) (art1.IVA / 100));

		// mostramos el mensaje
		System.out.println(art1.nombre + " - " + "Precio:" + art1.precio + "€ - IVA:" + art1.IVA + "% - PVP:" + pvp);

	}

}
