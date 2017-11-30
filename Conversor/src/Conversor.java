import java.util.Scanner;



public class Conversor {
	
	
	
		
	
		    public static void main(String[] args) {
		    	Scanner sc = new Scanner(System.in);
		    	 String texto;
		    	
		    	 int  moneda=0;
		    	 int cantidad=0;
		    	 double valor=0;
		    	 int res=0;
		    	 System.out.println("escribe una cantidad en euros");
		    	 cantidad=sc.nextInt();
		    	 System.out.println("la moneda que quieres convertir 1 libras 2 dollares 3 yenes ");
		    	 moneda=sc.nextInt();
		   
		   
		 
		        //Segun la moneda, calculamos la cantidad
		        switch (moneda){
		        case 1:
		            valor=cantidad*0.86;
		            System.out.println(valor);
		            break;
		        case 2:
		            
		           valor=cantidad*1.29;
		           System.out.println(valor);
		            break;
		        case 3:
		            valor=cantidad*129.852;
		            System.out.println(valor);
		            break;
		        default:
		            System.out.println("No has introducido una moneda correcta");
		           
		 
		        //Solo si es correcto muestra el mensaje
		      
		            System.out.println(cantidad+ " euros en " +moneda+ " son " +res);
		        }
		 
		    }
		}