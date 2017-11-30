/*18) Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
 * Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).*/


import java.util.Scanner;
public class Ejercicio18 {
  
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primero numero");
        int num1=sc.nextInt();
  
        System.out.println("Introduce el segundo numero");
        int num2=sc.nextInt();
  
        for (int i=0;i<10;i++){
            //Generamos un numero aleatorio
            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(numAleatorio);
        }
    }
}