/*1) Dadas dos variables num�ricas A y B, que el usuario debe teclear, se pide realizar un
algoritmo que intercambie los valores de ambas variables y muestre cu�nto valen al
final las dos variables (recuerda la asignaci�n).*/


import java.util.*; 

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub7
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Introduzca un n�mero");
		A=sc.nextInt();
		System.out.println("Introduzca otro n�mero");
		B=sc.nextInt();
		
		C=A;
		A=B;
		B=C;
		
		System.out.println("Hemos intercambiado los n�meros, ahora el primer n�mero es " + A + " y el segundo n�mero es " + B);
	}

}
