/*Hacer un programa para que pida una palabra de no m�s de 20 caracteres y efect�e todas
las rotaciones posibles de dicha palabra de forma que el �ltimo car�cter pase al primero y
los dem�s corran un espacio, es decir si la palabra fuera �HOLA� el resultado debe ser :
HOLA
AHOL
LAHO
OLAH
Observar que una palabra de n caracteres tiene n rotaciones.*/

import java.util.*;
public class Ejercicio11{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra = "";
		final int MAX = 20;
		int k;
		do{
			System.out.println("Dame una palabra hasta max 20 caracteres");
			palabra = teclado.next();
		}while(palabra.length() > MAX);
		
		for(k=0; k < palabra.length(); k++){
			System.out.println(palabra);
			palabra = palabra.substring(palabra.length()-1) 
					+ palabra.substring(0,palabra.length()-1);
		}

	}//main

}//class
