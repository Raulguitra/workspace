/*10) Crea un array de números y otro de String de 10 posiciones donde insertaremos notas 

entre 0 y 10 (debemos controlar que inserte una nota valida), pudiendo ser decimal 

la nota en el array de números, en el de Strings se insertaran los nombres de los alumnos.

Después, crearemos un array de String donde insertaremos el resultado de la nota con palabras.

Si la nota esta entre 0 y 4,99 , sera un suspenso
Si esta entre 5 y 6,99 , sera un bien.
Si esta entre 7 y 8,99 sera un notable.
Si esta entre 9 y 10 sera un sobresaliente.
Muestra por pantalla, el alumno su nota y su resultado en palabras. Crea los métodos que creas conveniente.*/


import javax.swing.JOptionPane;
public class Ejercicio10 {
 
    public static void main(String[] args) {
 
        //Tamaño del array
        final int TAMANIO=10;
 
        //Creamos los arrays
        String nombres[]=new String[TAMANIO];
        double notas[]=new double[TAMANIO];
 
        //Rellenamos el array de una vez
        rellenarArrays(notas, nombres);
 
        //Devuelve las notas con palabras
        String resultado[]=añadeResultado(notas);
 
        //Mostramos el resultado
        mostrarArrays(nombres, notas, resultado);
 
    }
 
    public static void rellenarArrays(double notas[], String nombres[]){
        for(int i=0;i<notas.length;i++){
            //Introducimos los valores de una vez, se pueden hacer en metodos separados
            nombres[i]=JOptionPane.showInputDialog("Introduce el nombre del alumno "+(i+1));
 
            double nota;
            //Validamos la nota
            do{
                String texto=JOptionPane.showInputDialog("Introduce una nota del alumno "+(i+1));
                nota=Double.parseDouble(texto);
                System.out.println(nota<=0 || nota>=10);
            }while(nota<=0 || nota>=10);
            notas[i]=nota;
        }
    }
 
    public static void mostrarArrays(String nombres[], double notas[], String resultado[]){
        for(int i=0;i<nombres.length;i++){
            System.out.println("El alumno "+nombres[i]+" tiene una nota de "+notas[i]+", por lo que su resultado es "+resultado[i]);
        }
    }
 
    public static String[] añadeResultado(double notas[]){
 
        String resultado[]=new String[notas.length];
        for(int i=0;i<notas.length;i++){
            //Convertimos la nota a entero, despues se quedara como estaba
            switch((int)notas[i]){
                case 1:
                case 2:
                case 3:
                case 4:
                    resultado[i]="Suspenso";
                    break;
                case 5:
                case 6:
                    resultado[i]="Bien";
                    break;
                case 7:
                case 8:
                    resultado[i]="Notable";
                    break;
                case 9:
                case 10:
                    resultado[i]="Sobresaliente";
                    break;
            }
        }
        return resultado;
    }
}