/*9) Realizar un algoritmo que dado un número entero, visualice en pantalla si es par o
impar.*/

import java.util.*;


public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un número");
		num=teclado.nextInt();
		
		if (num%2==0){
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
	}

}
