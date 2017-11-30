/*16) Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. 
Despu�s se te pedir� que introduzcas la contrase�a, con 3 intentos. 
Cuando aciertes ya no pedir� mas la contrase�a y mostrara un mensaje diciendo �Enhorabuena�. 
 * Piensa bien en la condici�n de salida (3 intentos y si acierta sale, aunque le queden intentos).*/



import java.util.Scanner;
public class Ejercico16 {
  
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        String contrase�a="eureka";
  
        final int INTENTOS = 3;
         
        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
        boolean acierto=false;
  
        String password;
        for (int i=0;i<INTENTOS && !acierto;i++){
            System.out.println("Introduce una contrase�a");
            password = sc.next();
  
            //Comprobamos si coincide, no usamos ==, usamos el metodo equals
            if (password.equals(contrase�a)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }
        }
    }
}