/*11) Algoritmo que nos diga si una persona puede acceder a cursar un ciclo formativo de
grado superior o no. Para acceder a un grado superior, si se tiene un título de bachiller,
en caso de no tenerlo, se puede acceder si hemos superado una prueba de acceso.*/

import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int posee, prueba;
		
		System.out.println("Tiene el titulo de bachiller? 1-si 2-no ");
		posee=teclado.nextInt();
		
		if (posee==1){
			System.out.println("Puede accerder al ciclo formativo");
		}
		else{
			System.out.println("Tiene la prueba de acceso aprobada 1-si 2-no??");
			prueba=teclado.nextInt();		
		if (prueba==1){
			System.out.println("Puede accerder al ciclo formativo");
		}
		else{
			System.out.println("No puede acceder al ciclo formativo");
		}
		}
	}

}
