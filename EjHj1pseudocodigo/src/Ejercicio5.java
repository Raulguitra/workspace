/*5) Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo,
debe imprimir el producto de los tres y si no lo es, imprimirá la suma.*/

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c, multiplicacion, suma;
		
		System.out.println("Introduzca un número");
		a = teclado.nextInt();
		System.out.println("Introduzca un segundo número");
		b = teclado.nextInt();
		System.out.println("Introduzca un tercer número");
		c = teclado.nextInt();
		
		if (a<0) {
			multiplicacion=a*b*c;
			System.out.println(" La multiplicación es " + multiplicacion);
		} if (a>=0){
			suma = a+b+c;
			System.out.println(" La suma es " + suma);
		}
		
	}

}
