
import java.util.*;

public class pokerbaraja {

	public static void main(String[] args) {
		String[] fig = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] palo = { "♥", "♦", "♣", "♠" };
		String[] combo = new String[48];
		int i, j, n, k;
		Scanner sc = new Scanner(System.in);

		System.out.print("Baraja ordenada: ");
		// Se concatenan las posibles combinaciones ordenadas
		k=0;
		for (i = 0; i < fig.length; i++) {
			for (j = 0; j < palo.length; j++) {
				combo[k]=fig[i]+palo[j];
				k++;
			}
		}
		/*		for (i = 0; i < 12; i++) {
			combo[i] = fig[i] + palo[0];
		}
		for (i = 12; i < 24; i++) {
			combo[i] = fig[i % 12] + palo[1];
		}
		for (i = 24; i < 36; i++) {
			combo[i] = fig[i % 12] + palo[2];
		}
		for (i = 36; i < 48; i++) {
			combo[i] = fig[i % 12] + palo[3];
		}*/

		System.out.println();
		for (i = 0; i < combo.length; i++) {
			System.out.printf("%4s", combo[i]);
		}

		System.out.println("\nPulsa un numero para barajar");
		n = sc.nextInt();
		while (n != 0) {
			// Se desordena el string ordenado combo
			Random r = new Random();
			for (i = combo.length; i > 0; i--) {
				int posicion = r.nextInt(i);
				String tmp = combo[i - 1];
				combo[i - 1] = combo[posicion];
				combo[posicion] = tmp;
			}
			// Se muestra desordenado
			System.out.println();
			for (i = 0; i < combo.length; i++) {
				System.out.printf("%4s", combo[i]);
			}

			System.out.println("\nPulsa un numero para barajar (0:Salir)");
			n = sc.nextInt();
		}

	}// main

}// Class