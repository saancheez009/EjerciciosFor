package EjerciciosFor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaramos las variables num, suma, cont1 y contador
		
		int num = 0; //Son los números introducidos por el usuario
		int suma = 0; //Es la suma de los números introducidos por el usuario
		int cont1 = 1; //Es el contador que cuenta los números introducidos, necesario para el cálculo de la media
		double media = 0;  //Es el cálculo de la media de los números introducidos
		
		
		//Introducimos e importamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca 10 números para mostrarle la media de los 10 números
		System.out.println("Por favor introduzca 10 números para mostrarle la media de los números");
		

		
		for (int i=1 ; i<=10; i++) {  //Mediante for declaramos que el sistema nos permita solo introducir 10 números
			num=sc.nextInt(); //Leemos los números introducidos 
			
			//Para que nuestro sistema funcione correctamente añadimos un condicional if para sumar los números introducidos y calcular la media
			if (num>0) {
				suma +=num;
				cont1++;
			
		}
		}
		media= (double) suma/cont1; //Calculamos la media
		
		 System.out.println(media); //Mostramos al usuariola media
		
	
	}
}
