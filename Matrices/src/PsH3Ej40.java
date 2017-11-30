/*40.-Crear una tabla de 3 páginas, 4 filas y 5 columnas donde el primer elemento valga 1, el
segundo 2, el tercero 3 y así sucesivamente, e imprimirla.*/

public class PsH3Ej40 {

	public static void main(String[] args) {
		int tabla[][][] = new int[3][4][5];
		int p, f, c, num;
		num = 0;
		for(p = 0; p < 3; p++){
			for(f = 0; f < 4; f++){
				for(c = 0; c < 5; c++){
					num++;
					tabla[p][f][c] = num;
				}
			}
		}
		// imprimimos la tabla
		for(p = 0; p < 3; p++){
			System.out.println("\n\nPagina: " + (p+1));
			for(f = 0; f < 4; f++){
				System.out.println();
				for(c = 0; c < 5; c++){
					System.out.printf("%5d", tabla[p][f][c]);
				}
			}
		}

	}//main

}//class
