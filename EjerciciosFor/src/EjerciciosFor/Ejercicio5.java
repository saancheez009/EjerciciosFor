package EjerciciosFor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num = 0;
		int suma = 0;
		int cont1 = 0;
		double media = 0;
		int contador=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca 10 números para mostrarle la media de los números");
		num=sc.nextInt();
	
		
		for (int i=0 ; i<=8; i++) {
			num=sc.nextInt();
			
			if (num>0) {
				suma +=num;
				cont1++;
			} else {
				contador++;
			}
		
		}
		media= (double) suma/cont1;
		
		 System.out.println(media);
		
	}

}
