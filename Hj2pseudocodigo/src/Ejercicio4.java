/*4) Escribir un programa que una vez que lea un número n por teclado calcule y escriba
sus divisores por la pantalla*/

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);

		int n, i;
		
		System.out.println("introducir un numero");
		n=teclado.nextInt();
		
		for(i=n; i>=1; i--){
			if (n%i==0){
				System.out.println("el numero " +i +" es divisor de " +n);
			}
		}
	}
}
