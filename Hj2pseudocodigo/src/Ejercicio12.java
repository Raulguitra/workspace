/*12) Un n�mero se dice que es perfecto cuando la suma de sus divisores excluido �l es
igual a dicho n�mero. Hacer un programa que lea un n�mero y nos diga si es � no
perfecto*/

import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner teclado=new Scanner(System.in);

		int n, i, divisores,suma, num;

		System.out.println("introducir un numero");
		n=teclado.nextInt();


		while (n<=0){
			System.out.println("introducir un numero");
			n=teclado.nextInt();

		}
		suma=0;
		for(i=1; i<n-1; i++){
			if(n%i==0){
				suma=suma+i;	
			}

		}if(suma==n){
			System.out.println("El n�mero es perfecto");
		}else{
			System.out.println("El n�mero no es perfecto");

		}
}
}
