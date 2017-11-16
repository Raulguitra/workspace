/*41.-Se dispone de una tabla de 5 páginas, 10 filas y 20 columnas, que se refieren al centro, al
curso y al número de alumnos de un colegio respectivamente. Imprimir la nota media por curso
y la nota media máxima y su centro de pertenencia.*/

public class ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int colegio [][][] = new int [5][10][20];
		int media [][] = new int [5][10];
		int centro, curso, alumnos;
		int suma, centroMax, cursoMax;
		int mediamax;

		for (centro=0; centro<5; centro++){
			System.out.print("\nCentro " + (centro + 1));
			for (curso=0; curso<10; curso++){
				System.out.printf("\nCurso: %2d", (curso + 1));
				for(alumnos=0; alumnos<20; alumnos++){

					colegio[centro][curso][alumnos]=(int)Math.floor(Math.random()*10);
					System.out.printf("%5d",colegio[centro][curso][alumnos]);
				}//for
				System.out.printf("\n");
			}//for
			System.out.printf("\n");

		}//for

		for (centro=0; centro<5; centro++){
			for (curso=0; curso<10; curso++){
				suma=0;
				for(alumnos=0; alumnos<20; alumnos++){
					suma += colegio[centro][curso][alumnos];

				}//for

				media [centro][curso] = suma/20;
				System.out.printf("%4d",media[centro][curso]);
			}//for
			System.out.printf("\n");
		}//for
		
		System.out.println();
		for (curso=0; curso<10; curso++){
			mediamax=0;  centroMax = 0;
			//System.out.println("\nMaximas notas en el curso " + (curso+1));
			for(centro=0; centro<5; centro++){
				if(media[centro][curso]>mediamax){
					mediamax=media[centro][curso];
					centroMax = centro;
					//System.out.printf("%4d", mediamax);
				}//if	
			}//for -- cambio de centro
			System.out.printf("\nMedia maxima del curso %3d: %4d y esta en el centro %3d", (curso+1), mediamax, centroMax+1);
		}//for
			
	}//main
}//class
