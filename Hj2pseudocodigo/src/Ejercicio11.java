/*11) Se define el factorial de un número n como:
n*(n-1)*(n-2)*.......*3*2*1. Hacer un programa que lea un número n
filtrando que sea mayor que cero y calcule su factorial*/

import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);

		int n, i, factorial,suma;

		System.out.println("introducir un numero");
		n=teclado.nextInt();
		
		while (n<=0){
			System.out.println("introducir un numero");
			n=teclado.nextInt();
		}
		factorial=1;
		for (i=n-1; i>=1; i--){
			factorial=factorial*i;	
		}
		
		
		System.out.println("el factorial " +n * factorial);
	}

}
