/*5) Hacer un programa que lea un número n y nos escriba en la pantalla mediante un
mensaje si es ó no primo (NOTA: Número primo es aquél que es divisible solo por
si mismo y por, la unidad)*/


import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);

		int n, i, conta;

		System.out.println("introducir un numero");
		n=teclado.nextInt();

		conta=0;
		for(i=2; i<n; i++){
			if (n%i==0){
				conta++;
			}
			}
		
		if(conta==0){				
			System.out.println("el numero " +n +" es primo");
		}else {	
				System.out.println("el numero " +n +" no es primo");
			}
		}

	}


