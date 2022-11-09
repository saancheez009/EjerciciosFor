package EjerciciosFor;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int contador=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca el número desde el que desea empezar a contar");
		num1=sc.nextInt();
		
		System.out.println("Por favor introduzca el número hasta el que desea contar");
		num2=sc.nextInt();

		for (int i=1 ; i<=num2 ; i++) {
		
			System.out.println(contador);
			contador++;
	}
	}
}
