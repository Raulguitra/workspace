/*15) Lee un n�mero por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volver� a pedir (do while), despu�s muestra ese n�mero por consola.*/


import java.util.Scanner;
public class Ejercicio15 {
  
    public static void main(String[] args) {
  
        /* Declaramos la varible ya que sino no podemos usarla
         * en el while por el tema de �mbito
         */
        int codigo;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero mayor que 0");
            codigo=sc.nextInt();
        }while(codigo<=0);
  
        System.out.println(codigo);
    }
}