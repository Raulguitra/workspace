/*14) Dado un numero n imprimir la lista de todos los numero primos hasta dicho numero
n*/

import java.util.*;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);

		int n, pp, div, contdiv;

		System.out.println("introducir un numero");
		n=teclado.nextInt();

		while (n<=0){
			System.out.println("introducir un numero");
			n=teclado.nextInt();

		}//fin while
		
			pp=n;
			for (pp=2; pp<n; pp++){
				contdiv=0;
				for(div=2; div<pp; div++){
					if(pp%div==0){
						contdiv++;
					}
				}
				if(contdiv==0){
					System.out.println("los primos son "+ pp);
				}
			}
		


	}
}
