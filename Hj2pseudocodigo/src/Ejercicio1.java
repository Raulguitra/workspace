/*1) Escribir un programa que calcule e imprima la SUMA de los números impares
comprendidos entre a y b que deben leerse por teclado y filtrarse para que a<=b*/

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int a, b, i, suma, num;

		System.out.println("Introduzca numero a");
		a = teclado.nextInt();
		System.out.println("Introduzca numero b");
		b = teclado.nextInt();

		while (a>b){
			System.out.println("Introduzca mayor que a");
			b = teclado.nextInt();
		}
		if (a%2!=0){
			num=a;
		}
		else {
			num=a+1;
		}
		suma=0;
		for (i=a; i<=b; i=i+2){
			suma=suma+num;
			num=num+2;
		}
		System.out.println("La suma de los números es " + suma);
	}
}
