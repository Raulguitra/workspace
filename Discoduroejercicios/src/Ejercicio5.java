/*5) Haz una aplicaci�n que calcule el �rea de un c�rculo(pi*R2).
El radio se pedir� por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el m�todo pow de Math.*/


import java.util.Locale;
import java.util.Scanner;
public class Ejercicio5 {
  
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un radio");
        sc.useLocale(Locale.US);
        double radio=sc.nextDouble();
  
        //Formula area circulo, usamos algunos de los metodos de Math
        double area=Math.PI*Math.pow(radio, 2);
  
        System.out.println("El area del circulo es "+area);
    }
}