/*7) Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero
que indicará fin de entrada de datos, el programa debe calcular y escribir la suma de
los introducidos en lugar par y los introducidos en lugar impar, es decir los
introducidos primero, tercero, quinto … etc. y la suma de los introducidos el
segundo, cuarto, sexto ... etc.*/


import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);

		int n, i, sumapares, sumaimpares;

		System.out.println("introducir un numero");
		n=teclado.nextInt();
		
		sumapares=0; sumaimpares=0;
		while (n!=0){
			if(n%2==0){
				sumapares=sumapares+n;
			}
			if(n%2!=0){
				sumaimpares=sumaimpares+n;
			}
			System.out.println("introducir un numero");
			n=teclado.nextInt();
		}
		System.out.println("la suma de numeros pares es " +sumapares);
		System.out.println("la suma de numeros impares es " +sumaimpares);
	}


	

	}


