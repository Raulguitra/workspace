/*6) Hacer un programa que lea un a serie de números por teclado de manera que cuando
el número leído sea el cero ya no se introduzcan más, el programa debe calcular y
escribir la suma de los números de la serie que son múltiplos de 5 y cuántos se han
introducido en total*/

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);

		int n, i, suma, conta, multiplos;

		System.out.println("introducir un numero");
		n=teclado.nextInt();


		suma=0; conta=0;
		while (n!=0){
			
			if(n%5==0){
				suma=suma+n;			
			}if(n!=0){
				conta++;
			}
			System.out.println("introducir un numero");
			n=teclado.nextInt();
		}
		System.out.println("Has introducido " +conta +" numeros");
		System.out.println("La suma de los multiplos de 5 es " +suma);
	}

}
