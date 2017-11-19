/*2) Algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta,
producto y división.*/


import java.util.*;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int A, B, suma, resta, multiplicacion, division;
		
		System.out.println("Introduzca un número");
		A=sc.nextInt();
		
		System.out.println("Introduzca un segundo número");
		B=sc.nextInt();
		
		suma=A+B;
		resta=A-B;
		multiplicacion=A*B;
		division=A/B;
		
		System.out.println("La suma es " + suma +" la resta es " + resta + " la multiplicacion " + multiplicacion + " y la division es " + division);
	}

}
