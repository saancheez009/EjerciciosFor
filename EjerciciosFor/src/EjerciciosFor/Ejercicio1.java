package EjerciciosFor;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaramos las variables num y contador
		int num; //Num es el número introducidopor el usuario que es el número hasta el que el sistema cuenta
		int contador=0; //Es el contador de números 
		
		//Introducimos e importamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca el número hasta el que desea que el sistema deje de contar
		System.out.println("Por favor introduzca un número para contar los números hasta el que usted desee");
		num=sc.nextInt(); //Leemos el número
		
		//Mediante for le pedimos al sistema que cuente hasta el número introducido por el usuario, para ello utilizamos i<=num, y procedemos a mostrarle los números contados
		for (int i=1 ; i<=num; i++) {
			System.out.println(contador);
			contador++;
		
		sc.close(); //Cerramos el scanner
		}
		
	}

}
