package EjerciciosFor;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaramos las variables contador y num
		int contador=0; //Esta variable contará los múltiplos de 3 que hay hasta el número introducido por el usuario
		int num; //Es el número ijntroducido por el usuario hasta el que el sistema contará los múltiplos de 3
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario  que por favor introduzca un número que sea el límite hasta el que el sistema contará los múltilos de 3
		System.out.println("Por favor introduzca un número, este será el número límite hasta donde contará los múltiplos de 3");
		num= sc.nextInt(); // leemos el número introducido por el usuario
		
		
		for (int i=3 ; i<=num; i=i+3) { //Mediante for declaramos la variable i igual a 3 para luego sumarle 3 y que sólo se lean múltiplos de 3
			
			//Ponemos en el for i=i+3 para que este solo cuente los números múltiplos de 3 hasta el número introducido por le usuario
			contador++; //Contamos los múltiplos de 3 hasta el número introducido por el usuario
	}
		
		//Le mostramos al usuario el total de números múltiplos de 3 que hay hasta el número que ha introducido
		System.out.println("Hay "+contador+" números múltiplos de tres");
		
		sc.close(); //Cerramos el scanner
}
}