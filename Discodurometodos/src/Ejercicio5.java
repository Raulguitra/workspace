/*6) Crea una aplicaci�n que nos cuente el n�mero de cifras de un n�mero entero positivo (hay que controlarlo) pedido por teclado. 
 * Crea un m�todo que realice esta acci�n, pasando el n�mero por par�metro, devolver� el n�mero de cifras.*/


import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main(String[] args) {
        int numero=0;
        do{
            String texto=JOptionPane.showInputDialog("Introduce un numero positivo");
            numero=Integer.parseInt(texto);
        }while(numero<0);
        int numCifras=cuentaCifras(numero);
        //Controlamos en el caso de que haya una cifra o mas
        if (numCifras==1){
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+numCifras+" cifras");
        }
    }
    public static int cuentaCifras (int numero){
         int contador=0;
         for (int i=numero;i>0;i/=10){
             //Incrementamos el contador
             contador++;
         }
         return contador;
    }
}