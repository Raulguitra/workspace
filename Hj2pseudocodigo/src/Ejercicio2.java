/*2) Calcular la suma de los cuadrados de los números pares comprendidos entre 1 y n
donde n es una variable que se leerá del exterior por el teclado.*/

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int n, i, suma;
		double num;
		System.out.println("Introducir un numero");
		n=teclado.nextInt();


		suma=0;
		for(i=1; i<=n; i++){
			num=Math.pow(i, 2);
			suma=(int) (suma+num);
		}
		System.out.println("la suma de los cuadrados es " +suma);

	}

}
