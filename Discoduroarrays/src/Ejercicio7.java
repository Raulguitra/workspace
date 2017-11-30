/*7) Crea dos arrays de números con una posición pasado por teclado.

Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior, después crea un nuevo array con el primer array (usa de nuevo new con el primer array) con el mismo tamaño que se ha pasado por teclado, rellenalo de nuevo con números aleatorios.

Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente. Por último, muestra el contenido de cada array.

Llama al final al recolector de basura.*/

import javax.swing.JOptionPane;
public class Ejercicio7 {
 
    public static void main(String[] args) {
 
        //Indicamos el tamaño
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int tamanio=Integer.parseInt(texto);
 
        //Creamos los arrays
        int array1[]=new int [tamanio];
        int array2[];
 
        //Rellenamos el array1
        rellenarNumAleatorioArray(array1, 10, 100);
 
        //Apuntamos el array2 al array1
        array2=array1;
 
        //Creamos un nuevo array, usando el array1. Array1 tendra una nueva direccion.
        array1=new int[tamanio];
 
        //Lo volvemos a rellenar, ya que al crear el array de nuevo no contiene los numeros anteriores
        rellenarNumAleatorioArray(array1, 10, 100);
 
        //Contiene el array con el resultado de multiplicar los valores de los arrays
        int array3[]=multiplicador(array1, array2);
 
        //Mostramos el contenido de los arrays
 
        System.out.println("Array1");
        mostrarArray(array1);
 
        System.out.println("Array2");
        mostrarArray(array2);
 
        System.out.println("Array3");
        mostrarArray(array3);
 
                //Llamamos al recolector de basura
                System.gc();
 
    }
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
 
    public static int[] multiplicador(int array1[], int array2[]){
        int array3[]=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }
}