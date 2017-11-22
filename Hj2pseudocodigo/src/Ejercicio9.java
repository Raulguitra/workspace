/*9) Escribir un programa que lea una secuencia de datos numéricos de longitud
indefinida de manera que cuando el número sea el cero cesará la entrada de dicha
secuencia. El programa debe imprimirnos la media de todos, el mayor y el menor.*/

import java.util.*;

public class Ejercicio9 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner teclado=new Scanner(System.in);

		int n, i, media, max, min, conta, suma;

		System.out.println("introducir un numero");
		n=teclado.nextInt();


		conta=0; suma=0; max=n; min=n; media=0;
		while(n!=0){
			conta++;
			suma=suma+n;
			media=suma/conta;
			if(n>max){
				max=n;
			}if(n<min){
				min=n;
			}
			System.out.println("introducir un numero");
			n=teclado.nextInt();
		}
		System.out.println("el numero maximo es " +max +" el numero minimo es " +min +" y la media es " +media);
	}

}
