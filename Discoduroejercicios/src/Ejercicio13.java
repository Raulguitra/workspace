/*13) Realiza una aplicaci�n que nos pida un n�mero de ventas a introducir, 7
despu�s nos pedir� tantas ventas por teclado como n�mero de ventas se hayan indicado. 
Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/

import java.util.Scanner;
public class Ejercicio13 {
  
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el n�mero de ventas");
        int numVentas=sc.nextInt();
  
        /*Declaramos una variable para sumar las ventas,
         * si lo declaramos dentro del bucle, no podriamos
         * acceder fuera del bucle a la suma de las ventas.
         * Esto es por el �mbito.
         */
        int sumaVentas=0;
        for (int i=0;i<numVentas;i++){
            //indico el numero de venta
            System.out.println("Introduce el precio de la venta "+(i+1));
            int venta=sc.nextInt();
  
            //Acumulamos el valor de la venta
            sumaVentas=sumaVentas+venta;
        }
  
        System.out.println(sumaVentas);
    }
}

