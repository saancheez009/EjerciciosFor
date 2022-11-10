package EjerciciosFor;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int calif;
		int suspenso=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Por favor introduzca 5 calificaciones, y le mostraremos el número de suspensos");
		

		for (int i=1 ; i<=5; i++) {
			calif=sc.nextInt();
			if(calif<5) {
				
			suspenso++;
			
			}
			
		}
		System.out.println("Hay "+suspenso+" suspensos");
	}

}


