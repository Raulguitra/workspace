/*12) Muestra los n�meros del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.*/


public class Ejercicio12 {


	 public static void main(String[] args) {
		 
	        //Definimos el bucle, incluye el 100
	        for (int num=1;num<=100;num++){
	            //Comprobamos si es divisible entre 2 o 3
	            if (num%2==0 || num%3==0){
	                System.out.println(num);
	            }
	        }
	    }
	}