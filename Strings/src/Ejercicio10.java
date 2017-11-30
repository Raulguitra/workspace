/*10. Escribir un programa que lea una frase (m�ximo 60 caracteres) y diga cu�ntas letras
distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras
debemos trabajar solo con may�sculas.*/

import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase = "";
		int k, indice, indiceConta, vecContaLetras [] = new int [26];
		final int MAX = 60;
		do{
			System.out.println("Dame una frase hasta max 60 caracteres");
			frase = teclado.nextLine();			
		}while(frase.length() > MAX);
		frase = frase.toUpperCase();
		for(k = 0; k < 26; k++){
			vecContaLetras [k] = 0;
		}
		for(indice = 0; indice < frase.length(); indice++){
			// solo contamos las letras entre A y Z
			// cualquier otro caracter lo ignoramos
			if(frase.charAt(indice) >= 'A' && frase.charAt(indice) <= 'Z'){
				indiceConta = frase.charAt(indice) - 65;
				vecContaLetras [indiceConta]++;
			}
		}
		for(indice = 0; indice < 26; indice++){
			if(vecContaLetras[indice]!=0){
				System.out.println("La letra " + (char)(indice + 65) + " aparece " 
						+ vecContaLetras[indice]);
			}
		}
	}//main
}//class
