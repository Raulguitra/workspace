/*24) Recorre el String del ejercicio 22 y transforma cada car�cter a su c�digo ASCII. 
 * Muestralos en linea recta, separados por un espacio entre cada car�cter.*/


public class Ejercicio24 {
 
    public static void main(String[] args) {
 
        String cadena="La lluvia en Sevilla es una maravilla";
 
        for (int i=0;i<cadena.length();i++){
            //Hacemos un casting para convertir el char a int
            System.out.print((int)cadena.charAt(i)+" ");
        }
    }
}
