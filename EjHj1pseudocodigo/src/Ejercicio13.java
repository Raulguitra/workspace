/*13) Se pide representar el algoritmo que nos calcule la suma de los N primeros n�meros
naturales. N se leer� por teclado (no tenemos porque llamar a la variable N, podemos
llamarla como queramos).*/

import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int i, N, suma;
		
		System.out.println("Introduzca un n�mero ");
		N=teclado.nextInt();
		
		suma=0;
		for (i=1; i<=N; i++){
			suma=suma+i;
		}
		System.out.println("La suma de los n�meros es " + suma);
	}

}
