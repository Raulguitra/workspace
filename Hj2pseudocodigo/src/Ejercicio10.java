/*10) Dado un numero n que filtraremos a que sea positivo, escribir un programa que nos
diga cu�l es el numero primo m�s cercano a �l por debajo.*/

import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner teclado=new Scanner(System.in);

		int n, i, num, conta;

		System.out.println("introducir un numero");
		n=teclado.nextInt();
		
		while (n<=0){
			System.out.println("introducir un numero");
			n=teclado.nextInt();
		}
		
		num=n; conta=0;
		for(i=2; i<num-1; i++){
			if(num%i==0){	
				conta=conta+1;
			}if(conta==0){
				
			}
		}System.out.println(+num +" es el numero primo por debajo de " +n);

	}

}
