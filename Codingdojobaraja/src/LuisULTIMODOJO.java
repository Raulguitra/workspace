import java.util.*;
public class LuisULTIMODOJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String vOrdenado[]={"A♥","2♥","3♥","4♥","5♥","6♥","7♥","8♥","9♥","10♥","J♥","Q♥","K♥","A♦","2♦","3♦","4♦","5♦","6♦","7♦","8♦","9♦","10♦","J♦","Q♦","K♦","A♣","2♣","3♣","4♣","5♣","6♣","7♣","8♣","9♣","10♣","J♣","Q♣","K♣","A♠","2♠","3♠","4♠","5♠","6♠","7♠","8♠","9♠","10♠","J♠","Q♠","K♠"};
		int aleatorios[]=new int [52];
		String vDesordenado[]=new String[52];

		for (int k = 0; k<52; k++){
			aleatorios[k]=k;
		}

		//Random r = new Random();
		for (int i = aleatorios.length; i > 0; i--) {
    		int posicion = (int) (Math.random()*i);
    		int tmp = aleatorios[i-1];
    		aleatorios[i - 1] = aleatorios[posicion];
    		aleatorios[posicion] = tmp;
    	}
		
		System.out.println();
    	System.out.println();
    	System.out.println("------Baraja ordenada------");

    	for (int k = 0; k<52; k++){
    		if(k%13==0){
				System.out.println();
			}System.out.printf("%5s", vOrdenado[k]);
		}

    	System.out.println();
    	System.out.println();
    	System.out.println("------Baraja desordenada------");
    	
		for (int k = 0; k<52; k++){
			vDesordenado[k]=vOrdenado[aleatorios[k]];
			if(k%13==0){
				System.out.println();
			}System.out.printf("%5s", vDesordenado[k]);
			
		}
		
		
	}

}
