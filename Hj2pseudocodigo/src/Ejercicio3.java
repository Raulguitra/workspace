/*3) Leer un número n que debe filtrarse entre 1 y 100 y a continuación calcular y
escribir la tabla de multiplicar de ese número con el siguiente formato:
TABLA DE MULTIPLICAR DE 8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
......
.....
8 * 10 = 80*/

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int n, i, total;

		System.out.println("introducir un numero de 1 a 100");
		n=teclado.nextInt();

		while(n<0 || n>100){
			System.out.println("introducir un numero de 1 a 100");
			n=teclado.nextInt();
		}
			for(i=1; i<=10;i++){
				total=n*i;
				System.out.println("La multiplicacion es " +n +" * " +i +" = " +total);
			}
		
	}

}
