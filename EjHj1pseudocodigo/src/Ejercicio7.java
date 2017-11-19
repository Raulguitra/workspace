/*7) Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el
curso actual. Diseñar un algoritmo para este propósito (recuerda que para calcular el
porcentaje puedes hacer una regla de 3).*/

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =new Scanner(System.in);
		
		int Niños, Niñas, porcentajeniños, porcentajeniñas;
		
		System.out.println("Introduzca numero de Niños");
		Niños=teclado.nextInt();
		System.out.println("Introduzca numero de Niñas");
		Niñas=teclado.nextInt();
		
		porcentajeniños=Niños*100/(Niños+Niñas);
		porcentajeniñas=Niñas*100/(Niños+Niñas);
		
		System.out.println("El porcentaje de niños es " + porcentajeniños);
		
		System.out.println("El porcentaje de niñas es " + porcentajeniñas);
	}

}
