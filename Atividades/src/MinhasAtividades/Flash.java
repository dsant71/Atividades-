package MinhasAtividades;

import java.util.Scanner;

public class Flash {

	public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        
	       
	        System.out.println("Insira, respectivamente, a massa e a velocidade do Flash");
	        int massa = teclado.nextInt();
	        int velocidade = teclado.nextInt();
	        
	        
	        long energia = (long) massa * (long) velocidade * velocidade;
	        
	    
	        System.out.println(energia);
	        
	     teclado.close();
	    }
	}
