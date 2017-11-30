/*2) Crea una aplicaci�n que dibuje una escalera inversa de asteriscos. 
 * Nosotros le pasamos la altura de la escalera inversa por teclado. Este es un ejemplo:*/


import javax.swing.JOptionPane;
public class Ejercicio2 {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Escribe una altura");
        int altura=Integer.parseInt(texto);
        dibujaEscaleraInversa(altura);
    }
    public static void dibujaEscaleraInversa (int altura){
        for (int numeroasteriscos=altura;numeroasteriscos>0;numeroasteriscos--){
                        //Este bucle pinta los asteriscos en cada fila
            for(int i=numeroasteriscos;i>0;i--){
                System.out.print("*");
            }
                        //Saltamos de linea
            System.out.println("");
        }
    }
}