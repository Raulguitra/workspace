/*4) Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor
(recuerda usar la estructura condicional Si y los operadores lógicos).*/


import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int A,B,C;

		System.out.println("Introduzca un número");
		A=teclado.nextInt();
		System.out.println("Introduzca un segundo número");
		B=teclado.nextInt();
		System.out.println("Introduzca un tercer número");
		C=teclado.nextInt();


		if (A>B && A>C){
			System.out.println("El número mayor es " + A);
		}

		if (B>A && B>C){
			System.out.println("El número mayor es " + B);
		}
		if (C>A && C>B) {
			System.out.println("El número mayor es " + C);
		}
	}
}
