package parte2.cuenta;

import java.util.Scanner;

public class PrincipalCC {

	public static void main(String[] args) {
		
		// instanciamos 2 cuentas
		CuentaCorriente cuenta1; // cuenta persona 1
		CuentaCorriente cuenta2; // cuenta persona 2
		
		// variables para almacenar la informacion de las cuentas corrientes
		String nombre;
		double saldo;
		String dni;
		
		// variable para utilizar en las funciones de ingresar y sacar dinero
		double ingreso;
		double sacar;
				
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		// pedimos el nombre de la persona
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		System.out.println(); // espacio en blanco para separar
		
		// pedimos el DNI
		System.out.println("Introduzca su DNI:");
		dni = sc.nextLine();
		System.out.println();
		
		// pedimos el saldo, teniendo en cuenta que el saldo inicial debe ser como minimo de 100 €
		System.out.println("Introduca su saldo:");
		saldo = sc.nextDouble();
		System.out.println();
		
		// asignamos los datos introducidos a la persona correspondiente
		cuenta1 = new CuentaCorriente (nombre, dni, saldo);
		
		// vaciamos el bufer para pedir los datos de la siguiente cuenta
		sc.nextLine();
		
		
		// pedimos el nombre de la persona
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		System.out.println(); // espacio en blanco para separar
				
		// pedimos el DNI
		System.out.println("Introduzca su DNI:");
		dni = sc.nextLine();
		System.out.println();
		
		// pedimos el saldo, teniendo en cuenta que el saldo inicial debe ser como minimo de 100 €
		System.out.println("Introduca su saldo:");
		saldo = sc.nextDouble();
		System.out.println();
		
		// asignamos los datos introducidos a la persona correspondiente
		cuenta2 = new CuentaCorriente (nombre, dni, saldo);
		
		// mostramos la informacion de la primera cuenta
		System.out.println("Cuenta 1:");
		System.out.println(cuenta1);
		System.out.println();
		
		// mostramos la informacion de la segunda persona
		System.out.println("Cuenta 2:");
		System.out.println(cuenta2);
		System.out.println();
		
		// comprobamos si las cuentas son iguales
		System.out.println(cuenta1.equals(cuenta2) ? "La cuenta 1 y la cuenta 2 son iguales" : "La cuenta 1 y la cuenta 2 no son iguales");
		
		// pedimos la cantidad de dinero para sacar de la cuenta 1
		System.out.println("Introduzca una cantidad para sacar de la cuenta:");
		sacar = sc.nextDouble();
		
		// comprobamos si la cantidad de dinero es correcta
		if (cuenta1.sacarDinero(sacar))
		
		// cerramos el escaner
		sc.close();
		
		System.out.println();
		
	}

}
