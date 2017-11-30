/*9) Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolverá el DNI completo.

Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado debe estar entre 0 y 22. Haz un método donde según el resultado de la anterior formula busque en un array de caracteres la posición que corresponda a la letra. Esta es la tabla de caracteres:*/


import javax.swing.JOptionPane;
public class Ejercicio9 {
 
    public static void main(String[] args) {
 
        //Declaramos como constante por lo que dividir
        final int DIVISOR=23;
 
        //Insertamos el DNI
        String texto=JOptionPane.showInputDialog("Escribe los numero de tu DNI");
        int dni=Integer.parseInt(texto);
 
        //Sacamos el resto
        int res=dni%DIVISOR;
 
        //Invocamos el metodo
        char letra=letraNIF(res);
 
        //Mostramos el DNI completo
        System.out.println("Tu DNI es " +dni+letra);
 
    }
    public static char letraNIF(int res){
 
        //Definimos el array de char
        char letrasNIF[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                          'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                          'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        //Devolvemos el valor en la posicion del array
        return letrasNIF[res];
    }
}