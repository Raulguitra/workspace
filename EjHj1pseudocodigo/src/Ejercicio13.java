/*13) Se pide representar el algoritmo que nos calcule la suma de los N primeros números
naturales. N se leerá por teclado (no tenemos porque llamar a la variable N, podemos
llamarla como queramos).*/

import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int i, N, suma;
		
		System.out.println("Introduzca un número ");
		N=teclado.nextInt();
		
		suma=0;
		for (i=1; i<=N; i++){
			suma=suma+i;
		}
		System.out.println("La suma de los números es " + suma);
	}

}
