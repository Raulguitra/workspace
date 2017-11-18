/*6) Realizar un algoritmo que lea un n�mero por teclado. En caso de que ese n�mero sea
0 o menor que 0, se saldr� del programa imprimiendo antes un mensaje de error. Si es
mayor que 0, se deber� calcular su cuadrado y la ra�z cuadrada del mismo, visualizando
el numero que ha tecleado el usuario y su resultado (�Del numero X, su potencia es X y
su ra�z X�). Para calcular la ra�z cuadrada se puede usar la funci�n interna RAIZ(X) o
con una potencia de 0,5.*/

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int a;
		double laraiz, cuadrado;
		
		System.out.println("Introduzca un n�mero");
		a = teclado.nextInt();
		
		if (a<=0){
			System.out.println("Error!! El n�mero introducido es igual o menos que 0");
		}
		
		if (a>0){
			cuadrado=Math.pow(a, 2);
			laraiz=Math.sqrt(a);
			System.out.println("El cuadrado de " + a + " es " + cuadrado);
			System.out.println("La raiz de " + a + " es " + laraiz);
		}
	}

}
