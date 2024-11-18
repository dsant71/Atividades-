package MinhasAtividades;

import java.util.Scanner;

public class Ferreiro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int metal, madeira, couro, quantidade;
		
		System.out.println("Insira, respectivamente, a quantidade de fragmentos de aço, pedaços de madeira e couro que o ferreiro dispõe");
          	metal = teclado.nextInt();
          	madeira = teclado.nextInt();
          	couro = teclado.nextInt(); 
          	
		          	if (metal < 2) {
		                System.out.println("Não será possível produzir nenhuma espada.");
          			
		          	
		          	
		          	
		          	
		          	} else if (madeira < 3) {
          			    System.out.println("Não será possível produzir nenhuma espada.");
          			
          			} else if (couro < 5) {
          				 System.out.println("Não será possível produzir nenhuma espada.");
          
          			} else if (metal > madeira && metal > madeira) {
          				quantidade = madeira/3;
       				   System.out.println("Será possível produzir " + quantidade + " espada(s).");	
	          	
          			} else if (couro > metal) {
        	  
          			  quantidade = metal/2;
          				  System.out.println("Será possível produzir " + quantidade + " espada(s)." );
          
          			} else if (metal >= couro) {
          				quantidade = couro/5;
          				   System.out.println("Será possível produzir " + quantidade + " espada(s).");	
          			
       				
       			}
	
	
	
	}
}
