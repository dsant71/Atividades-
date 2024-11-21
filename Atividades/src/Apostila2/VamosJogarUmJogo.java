package Apostila2;
import java.util.Scanner;
public class VamosJogarUmJogo {

	

	
	    public static void main(String[] args) {
	      
	        Scanner teclado = new Scanner(System.in);
	        System.out.println("Insira a frase");
	        String frase = teclado.nextLine().replace(" ", "");
	        
	        System.out.println("Insira a sentença e a quantidade de vezes que a mesma se repete");
	        String sentenca = teclado.next();
	        int q = teclado.nextInt();
	        
	        
	        int ocorrencias = contarOcorrencias(frase, sentenca);
	        
	       
	        System.out.println(ocorrencias);
	        
	        
	        if (ocorrencias == q) {
	            System.out.println("SIM!");
	        } else {
	            System.out.println("NAO!");
	        }
	        
	        
	        teclado.close();
	    }

	   
	    public static int contarOcorrencias(String frase, String palavra) {
	        int count = 0;
	        int index = 0;
	        
	        
	        while ((index = frase.indexOf(palavra, index)) != -1) {
	            count++;
	            index += palavra.length(); 
	        }
	        
	        return count;
	}
}



