/*7) Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el
curso actual. Dise�ar un algoritmo para este prop�sito (recuerda que para calcular el
porcentaje puedes hacer una regla de 3).*/

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =new Scanner(System.in);
		
		int Ni�os, Ni�as, porcentajeni�os, porcentajeni�as;
		
		System.out.println("Introduzca numero de Ni�os");
		Ni�os=teclado.nextInt();
		System.out.println("Introduzca numero de Ni�as");
		Ni�as=teclado.nextInt();
		
		porcentajeni�os=Ni�os*100/(Ni�os+Ni�as);
		porcentajeni�as=Ni�as*100/(Ni�os+Ni�as);
		
		System.out.println("El porcentaje de ni�os es " + porcentajeni�os);
		
		System.out.println("El porcentaje de ni�as es " + porcentajeni�as);
	}

}
