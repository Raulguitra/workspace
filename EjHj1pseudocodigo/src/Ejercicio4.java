/*4) Algoritmo que lea tres n�meros distintos y nos diga cu�l de ellos es el mayor
(recuerda usar la estructura condicional Si y los operadores l�gicos).*/


import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int A,B,C;

		System.out.println("Introduzca un n�mero");
		A=teclado.nextInt();
		System.out.println("Introduzca un segundo n�mero");
		B=teclado.nextInt();
		System.out.println("Introduzca un tercer n�mero");
		C=teclado.nextInt();


		if (A>B && A>C){
			System.out.println("El n�mero mayor es " + A);
		}

		if (B>A && B>C){
			System.out.println("El n�mero mayor es " + B);
		}
		if (C>A && C>B) {
			System.out.println("El n�mero mayor es " + C);
		}
	}
}
