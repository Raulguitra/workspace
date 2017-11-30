/*25) Crea una aplicaci�n llamada CalculadoraPolacaInversaApp, nos pedir� 2 operandos (int) 
y un signo aritm�tico (String), 
 * seg�n este �ltimo se realizara la operaci�n correspondiente. 
 * Al final mostrara el resultado en un cuadro de dialogo.

Los signos aritm�ticos disponibles son:

+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1� operando como base y 2� como exponente.
%:  m�dulo, resto de la divisi�n entre operando1 y operando2.*/



import java.util.Locale;
import java.util.Scanner;
public class Ejercicio25 {
  
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //no importa que sean int o double
        double operando1;
        double operando2;
        double resultado=0;
  
        //Nos pide los operandos y el signo de operacion
        System.out.println("Escribe el operando 1");
        operando1=sc.nextDouble();
         
        System.out.println("Escribe el codigo de operacion");
        String operacion = sc.next();
         
        System.out.println("Escribe el operando 2");
        operando2=sc.nextDouble();
  
        //segun el codigo de operacion, haremos una u otra accion
        switch (operacion){
            case "+":
                resultado=operando1+operando2;
                break;
            case "-":
                resultado=operando1-operando2;
                break;
            case "*":
                resultado=operando1*operando2;
                break;
            case "/":
                resultado=operando1/operando2;
                break;
            case "^":
                resultado=(int)Math.pow(operando1, operando2);
                break;
            case "%":
                resultado=operando1%operando2;
                break;
        }
  
        System.out.println( operando1+" "+operacion+" "+operando2+" = "+resultado);
  
    }
}