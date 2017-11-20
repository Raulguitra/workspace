/*14) Se pide representar el algoritmo que nos calcule la suma de los N primeros 
números pares a partir de N (si N es par sería el primer número que hay que sumar). Es decir,
si insertamos un 5, nos haga la suma de 6+8+10+12+14.*/

import java.util.*;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int i, N, num, suma, sumaimpar, contador;

		System.out.println("Introduzca un número ");
		N=teclado.nextInt();
		
			if (N%2==0){
				num	=N;
			}
			else {
				num=N+1;
			}
			suma=0;
			
			for (i=N; i>=1; i--){
				suma= suma + num;
				num= num +2;
			}
		
		System.out.println("La suma de los números es " + suma);
		
	}

}
