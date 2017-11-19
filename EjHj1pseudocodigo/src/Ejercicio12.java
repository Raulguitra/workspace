/*12) Desarrollar un algoritmo que nos calcule el cuadrado de los 9 primeros números
naturales (recuerda la estructura para)*/


import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int i;
		double cuadrado;
		for (i=1; i<10;i++){
			cuadrado=Math.pow(i, 2);
			System.out.println("El cuadrado de " + i + " es " + cuadrado);
			
		}
	}

}
