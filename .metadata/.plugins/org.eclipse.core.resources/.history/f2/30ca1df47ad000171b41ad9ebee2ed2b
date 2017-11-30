/*10) Dado un numero n que filtraremos a que sea positivo, escribir un programa que nos
diga cuál es el numero primo más cercano a él por debajo.*/

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner teclado=new Scanner(System.in);

		int n, i, num, conta;
		boolean encontrado;
		System.out.println("introducir un numero");
		n=teclado.nextInt();

		while (n<=0){
			System.out.println("introducir un numero");
			n=teclado.nextInt();
		}
		num = n; 
		encontrado = false;
		while(encontrado ==false ){
			num = num - 1; conta = 0;
			for(i=2; i<num-1; i++){
				if(num % i ==0){
					conta = conta +1;
				}//end if

			}//end for
			if(conta == 0){
				encontrado = true;
				System.out.println("el numero " + num + " es el mas cercano a " + n + " por debajo");
			}//end if

		}//end while



	}

}