/*8) Dados dos números p y q que leeremos por teclado y que deben ser positivos, hacer
un programa que nos diga cual de los dos tiene más divisores, con un mensaje que
diga “p tiene mas divisores que q” ó viceversa.*/

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);

		int num1, num2, i, contanum1, contanum2;

		System.out.println("introducir un numero");
		num1=teclado.nextInt();
		
		System.out.println("introducir un numero");
		num2=teclado.nextInt();
		
		contanum1=0;
		for (i=1; i<=num1;i++){
			if(num1%i==0){
				contanum1++;
			}
		}
		contanum2=0;
		for (i=1; i<=num2;i++){
			if(num2%i==0){
				contanum2++;
			}
		}
		if (contanum1>contanum2){
			System.out.println(num1 +" tiene mas divisores que " +num2);
		}if(contanum2>contanum1){
			System.out.println(num2 +" tiene mas divisores que " +num1);
		}if(contanum1==contanum2) {
			System.out.println(num2 +" tienen los mismos divisores que " +num1);
		}
	}

}
