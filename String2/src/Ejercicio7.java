/*7. Escribe un programa que pida por teclado una palabra y muestre por pantalla cu�l es
la vocal que m�s veces contiene la palabra junto al n�mero de veces que la tiene.*/

import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String palabra, patronVocales = "AEIOU";
		int indice, posicionVocal, max, posMax;
		
		int vecContadorVocales[] = {0,0,0,0,0};
		
		System.out.println("Palabra: ");
		palabra=teclado.next();  

		palabra = palabra.toUpperCase();
		
		for(indice = 0; indice < palabra.length(); indice++){
			posicionVocal = patronVocales.indexOf(palabra.charAt(indice));
			if(posicionVocal != -1){
				vecContadorVocales[posicionVocal]++;
			}
		}
		
		max=0;
		for(indice=0; indice < 5; indice++){
			if(vecContadorVocales[indice] > max){
				max = vecContadorVocales[indice];
			}
		}
		
		// considero que puede haber empate entre varias vocales que se repitan 
		//el maximo numero de veces
		System.out.println("La(s) vocal(es) que mas se repite(n) es(son):");
		for(indice=0; indice < 5; indice++){
			if(vecContadorVocales[indice] == max){
				System.out.print(patronVocales.charAt(indice) + " ");
			}
		}
		System.out.printf("\nCon %d repeticiones", max);
	}//main

}

// paralelo   pianista