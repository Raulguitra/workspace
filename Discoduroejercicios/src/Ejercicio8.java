/*8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.*/


import java.util.Scanner;
 
public class Ejercicio8 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un codigo de la tabla ASCII");
        int codigo = sc.nextInt();
 
        //Pasamos el codigo a caracter
        char caracter = (char) codigo;
 
        System.out.println(caracter);
    }
}