/*41.-Se dispone de una tabla de 5 páginas, 10 filas y 20 columnas, que se refieren al centro, al
curso y al número de alumnos de un colegio respectivamente. Imprimir la nota media por curso
y la nota media máxima y su centro de pertenencia.*/

public class ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int colegio [][][] = new int [5][10][20];
		int media [][] = new int [5][10];
		int i, j, k;
		int suma;
		int mediamax;

		for (i=0; i<5; i++){
			for (j=0; j<10; j++){
				for(k=0; k<20; k++){

					colegio[i][j][k]=(int)Math.floor(Math.random()*10);
					System.out.printf("%5d",colegio[i][j][k]);
				}//for
				System.out.printf("\n");
			}//for
			System.out.printf("\n");

		}//for

		for (i=0; i<5; i++){
			for (j=0; j<10; j++){
				suma=0;
				for(k=0; k<20; k++){
					suma += colegio[i][j][k];

				}//for

				media [i][j] = suma/20;
				System.out.printf("%4d",media[i][j]);
			}//for
			System.out.printf("\n");
		}//for
		
		System.out.println();
		
			
		for (j=0; j<10; j++){
			mediamax=0;
			for(i=0; i<5; i++){
				if(media[i][j]>mediamax){
					mediamax=media[i][j];
					System.out.printf("%4d", mediamax);
				}//if	
			}//for
			
		}//for

	}//main
}//class
