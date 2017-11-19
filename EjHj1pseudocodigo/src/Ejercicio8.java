/*8) Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes de
octubre. Dado un mes y un importe, calcular cuál es la cantidad que se debe cobrar al
cliente.*/

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int mes, importe, total;

		System.out.println("Introduzca número de mes");
		mes=teclado.nextInt();
		System.out.println("Introduzca número de importe");
		importe=teclado.nextInt();

		if(mes==10){
			total=importe-(importe*15/100);
			System.out.println("El importe total a pagar aplicado el decuento es " + total);
		}
		else {
			System.out.println("El importe total a pagar es " + importe);
		}

	}

}
