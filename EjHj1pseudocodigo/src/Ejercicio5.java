/*5) Dise�ar un algoritmo que pida por teclado tres n�meros; si el primero es negativo,
debe imprimir el producto de los tres y si no lo es, imprimir� la suma.*/

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c, multiplicacion, suma;
		
		System.out.println("Introduzca un n�mero");
		a = teclado.nextInt();
		System.out.println("Introduzca un segundo n�mero");
		b = teclado.nextInt();
		System.out.println("Introduzca un tercer n�mero");
		c = teclado.nextInt();
		
		if (a<0) {
			multiplicacion=a*b*c;
			System.out.println(" La multiplicaci�n es " + multiplicacion);
		} if (a>=0){
			suma = a+b+c;
			System.out.println(" La suma es " + suma);
		}
		
	}

}
