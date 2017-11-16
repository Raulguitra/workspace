/*42.-Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus tres
representantes a lo largo de doce meses de sus cuatro productos, VENTAS [representante,
mes, producto]. Queremos proyectar el array tridimensional sobre uno de dos dimensiones que
represente el total de ventas, TOTAL [mes, producto], para lo cual sumamos las ventas de
cada producto de cada mes de todos los representantes. Imprimir ambos arrays.*/

public class ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int empresa [][][]= new int [12][4][3];
		int totalventas [][] = new int [12][4];
		int i, j, k;
		int suma;
		for (i=0; i<12; i++){
			for (j=0; j<4; j++){
				for(k=0; k<3; k++){

					empresa[i][j][k]=(int)Math.floor(Math.random()*10);
					System.out.printf("%2d",empresa[i][j][k]);
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");

		}

		for (i=0; i<12; i++){
			for (j=0; j<4; j++){
				suma=0;
			for(k=0; k<3; k++){
				suma += empresa[i][j][k];
			}
			totalventas [i][j]=suma;
			System.out.printf("%8d",totalventas[i][j]);
		}
			System.out.printf("\n");	
	}
		
}

}
