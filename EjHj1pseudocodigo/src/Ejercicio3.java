/*3) Algoritmo que lea dos números y nos diga cuál de ellos es mayor o bien si son
iguales (recuerda usar la estructura condicional SI)*/


import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int A, B;

		System.out.println("Intorduzca un número");
		A=sc.nextInt();
		System.out.println("Introduzca un segundo número");
		B=sc.nextInt();

		if (A>B){
			System.out.println(A + " es mayor que " + B);
		}
			if (A<B){
				System.out.println(A + " es menor que " + B);
			}
				if (A==B){
					System.out.println(A + " es igual a " + B);
				}
	}
}
