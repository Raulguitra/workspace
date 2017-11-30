/*3) Crea una aplicaci�n que nos pida un n�mero por teclado y con un m�todo se lo pasamos por par�metro para que nos indique si es o no un n�mero primo, debe devolver true si es primo sino false.

Un n�mero primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

Un buen truco para calcular la ra�z cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.*/


import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        //Ejecutamos la funcion, como devuelve true o false, se puede colocar en un if"
        if (esPrimo(numero)){
            System.out.println("El numero "+numero+" es primo");
        }else{
            System.out.println("El numero "+numero+" no es primo");
        }
    }
    public static boolean esPrimo (int numero){
 
        //Un numero menor o igual que 1, no es primo.
        if (numero<=1){
            return false;
        }
 
        //Declaramos esta variable aqui ya que despues es usada"
        int cont=0;
        for (int divisor=(int)Math.sqrt(numero);divisor>1;divisor--){
            //contabilizados los divisibles"
                if (numero%divisor==0){
                cont+=1;
            }
        }
        //Seg�n el numero de divisibles es o no primo"
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    }
}
