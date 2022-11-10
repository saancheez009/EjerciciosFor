package EjerciciosFor;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Declaramos la variable suma 
		int suma =0; //Es la suma de los 10 primeros números impares
		
		//Mediante for declaro que se sumen los número primos hasta el numero 10
		
		for (int i=1 ; i <=9; i+=2) { //A i le sumamos 2 para sumar solo los impares
			suma+=i; //Esta es la suma de los números primos
		}
		System.out.println("La suma de los números impares es " + suma);
	}
}
