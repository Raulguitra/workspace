import java.util.Scanner;

public class Romanos {

	public static void main(String[] args) {
		String unidad []={"","I","II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String decena []={"","X","XX", "XXX","XL", "L", "LX", "LXX", "LXXX", "XC"};
		String centena []={"","C","CC","CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String mil []={"","M","MM","MMM","IV"};
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do{
			System.out.println("Escribe un numero");
			numero = sc.nextInt();
		}while (numero<1 || numero>=5000);
		
		int u=numero%10;
		int d=(numero/10)%10;
		int c=(numero/100)%10;
		int m=numero/1000;

		if (numero>999){
			if (mil[m].equals("IV")){
			System.out.println("__");
			}
			System.out.println(mil[m]+centena[c]+decena[d] +unidad[u]);
		}else if (numero>99){
			System.out.println(centena[c]+decena[d] +unidad[u]);
		}else if(numero>9){
			System.out.println(decena[d] +unidad[u]);
		}else{
			System.out.println(unidad[u]);
		}
	}//main

}//Class