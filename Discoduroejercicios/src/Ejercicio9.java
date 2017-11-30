/*9) Lee un número por teclado que pida el precio de un producto (puede tener decimales)
 *  y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.*/



import java.util.Scanner;
 
public class Ejercicio9 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII");
        char caracter = sc.next().charAt(0);
 
        //Pasamos el caracter a codigo
        int codigo = (int) caracter;
 
        System.out.println(codigo);
    }
}