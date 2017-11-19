/*15) Dada una secuencia de números leídos por teclado, que acabe con un –1, por
ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,……,-1; Realizar el algoritmo que calcule la media
aritmética. Suponemos que el usuario no insertara número negativos*/

import java.util.*;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		int num, media, suma, contador;
		
		
		System.out.println("Introduzca número un numero");
		num=teclado.nextInt();
		suma=0;contador=0;
		while (num!=-1){
			suma=suma+num;
			contador=contador+1;
			System.out.println("Introduzca número un numero");
			num=teclado.nextInt();
		}
		media=suma/contador;
		
		System.out.println("La media aritmetica es " +media);

	}

}
