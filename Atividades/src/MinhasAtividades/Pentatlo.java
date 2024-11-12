package MinhasAtividades;

import java.util.Scanner;

public class Pentatlo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        int competidor;
        float n1, n2, n3, n4, n5, media;
    
        	System.out.println("Insira o número de inscrição do competidor");
        	competidor = teclado.nextInt();
        		
        		if (competidor > 1000 || competidor < 0) {
        			System.out.println("Numero de inscrição inválido");
        	  
        	  } else {
	
        		   System.out.println("Insira as 5 notas do competidor");
        		   	  n1 = teclado.nextFloat();
        		   	  n2 = teclado.nextFloat();
        		   	  n3 = teclado.nextFloat();
        		   	  n4 = teclado.nextFloat();
        		   	  n5 = teclado.nextFloat();
        		   	  media = (n1 + n2 + n3 + n4 + n5)/5;
        		
        		if (n1 > 10 || n2 > 10 || n3 > 10 || n4 > 10|| n5 > 10 ) {
        		  System.out.println("Nota inválida");
		
        	  } else {
        		  System.out.println("A média final do competidor " + competidor + " foi: " + media);
		
        	  
       teclado.close();
        	  
        	  
        	  
        	  }
	       }
	}

}
