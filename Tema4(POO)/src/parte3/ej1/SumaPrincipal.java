package parte3.ej1;

//import java.util.Scanner;

public class SumaPrincipal {

	public static void main(String[] args) {
		
		// instanciamos 2 objetos de la clase sumaNumeros
		SumaNumeros sumaEnteros = new SumaNumeros();
		SumaNumeros sumaDecimal = new SumaNumeros();
		
		
		// mostramos la suma de dos numeros enteros
		System.out.println(SumaNumeros.suma(1, 2));
		
		System.out.println();
		
		// mostramos la suma de dos numeros decimales
		System.out.println(SumaNumeros.suma(1.2, 2));;
		
		
		/*
		
		// variable para almacenar los numero de la suma
		double n1;
		double n2;
		
		// escaner para pedir datos al usuario
		Scanner sc = new Scanner (System.in);
		
		// pedirmos los numeros
		System.out.println("Introduzca el primer numero");
		n1 = sc.nextDouble();
		
		System.out.println("Introduzca el segundo numero");
		n2 = sc.nextDouble();
		
		System.out.println(SumaNumeros.suma(n1, n2));
		
		// cerramos el escaner
		sc.close();
		
		*/
	}

}
