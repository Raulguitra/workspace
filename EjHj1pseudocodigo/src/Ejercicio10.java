/*10) Modificar el algoritmo anterior, de forma que si se teclea un cero, se vuelva a pedir
el n�mero por teclado (as� hasta que se teclee un n�mero mayor que cero) (recuerda la
estructura mientras).*/

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int num;

		System.out.println("Introduzca un n�mero");
		num=teclado.nextInt();
		
		while (num==0){
			System.out.println("Introduzca un n�mero");
			num=teclado.nextInt();
		}
		
		if (num%2==0){
			System.out.println("El n�mero es par");
		}
		else {
			System.out.println("El n�mero es impar");
		}

	}

}
