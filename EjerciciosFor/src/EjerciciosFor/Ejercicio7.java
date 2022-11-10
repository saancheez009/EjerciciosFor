package EjerciciosFor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int num;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduzca un número para calcular su factorial: ");
		num=sc.nextInt();
		
		for (int i=num-1 ; i>0 ; i--) {
			num *=i;
			
			
	}
		System.out.println("El RESULTADO DEL CÁLCULO ES: "+num);
	}
}

