/*18) Algoritmo que visualice la cuenta de los números que son múltiplos de 2 o de 3 que
hay entre 1 y 100.*/


import java.util.*;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int i, suma;
		
		suma=0;
		
		for (i=1; i<=100; i++){
			if (i%2==0 || i%3==0){
				suma=suma+1;
				System.out.println("Es multiplo de 2 o 3 :" + i);
			}
		}
		
		System.out.println("La cantidad de numeros multiplos de 2 y 3, en los primeros cien numeros es: " + suma);
	}

}
