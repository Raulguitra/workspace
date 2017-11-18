/*1) Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un
algoritmo que intercambie los valores de ambas variables y muestre cuánto valen al
final las dos variables (recuerda la asignación).*/


import java.util.*; 

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub7
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Introduzca un número");
		A=sc.nextInt();
		System.out.println("Introduzca otro número");
		B=sc.nextInt();
		
		C=A;
		A=B;
		B=C;
		
		System.out.println("Hemos intercambiado los números, ahora el primer número es " + A + " y el segundo número es " + B);
	}

}
