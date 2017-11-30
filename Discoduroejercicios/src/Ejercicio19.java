/*19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra  
 * el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. 
 * Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.*/


import java.util.Scanner;
public class Ejercicio19 {
  
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        int numero=0;
        do{
            System.out.println("Introduce un numero");
            numero=sc.nextInt();
        }while(numero<0);
  
        int contador=0;
        for (int i=numero;i>0;i/=10){
            //Incrementamos el contador
            contador++;
        }
  
        //Controlamos en el caso de que haya una cifra o mas
        if (contador==1){
            System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
        }
  
    }
}