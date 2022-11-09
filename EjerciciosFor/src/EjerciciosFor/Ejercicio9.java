package EjerciciosFor;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int numero;
		boolean esPrimo=true;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduca un número entero positivo");
		numero=sc.nextInt();
		
		if(numero>0) {
			for(int i=2; i<numero; i++) {
				if (numero%i==0) {
					esPrimo=false;
					break;
				}
			}
			
			System.out.println(esPrimo ? "Es primo":"No es primo");
		}else {
			System.out.println("No ha introducido un entero positivo");
		}
		

	}

}
