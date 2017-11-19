/*17) Algoritmo que lea números enteros hasta teclear 0, y nos muestre el máximo, el
mínimo y la media de todos ellos. Piensa como debemos inicializar las variables.*/

import java.util.*;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int num, media, suma, contador, max, min;

		System.out.println("Introduzca un numero");
		num=teclado.nextInt();
		suma=0; contador=0; max=num; min=num;
		while (num!=0){	
			if(num>max){
				max=num;
			}
			if(num<min){
				min=num;
			}
			suma=suma+num;
			contador=contador+1;
			System.out.println("Introduzca un numero");
			num=teclado.nextInt();

		}
		media=suma/contador;
		System.out.println("El numero maximo es "+max +" el minimo es " +min + " y la media es " +media);
	}

}
