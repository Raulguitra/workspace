/*2) Crea una aplicaci�n que nos genere una cantidad de n�meros enteros aleatorios que nosotros le pasaremos por teclado. 
 * Crea un m�todo donde pasamos como par�metros entre que n�meros queremos que los genere, 
 * podemos pedirlas por teclado antes de generar los n�meros.
 *  Este m�todo devolver� un n�mero entero aleatorio. Muestra estos n�meros por pantalla.*/


import javax.swing.JOptionPane;
public class Ejercicio2 {
    public static void main(String[] args) {
        //Introducimos los datos necesarios
        String texto=JOptionPane.showInputDialog("Introduce el limite");
        int limite=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero1=Integer.parseInt(texto);
        texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero2=Integer.parseInt(texto);
        //generamos los numeros
        for(int i=0;i<limite;i++){
            System.out.println(generaNumero(numero1, numero2));
        }
    }
   public static int generaNumero(int num1, int num2){
        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
    }
}