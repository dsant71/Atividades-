package MinhasAtividades;

import java.util.Scanner;

public class PiramideMario {

	

	    public static void imprimirPiramide(int P) {
	        for (int i = 1; i <= P; i++) {
	           
	            String linha = "";
	            
	            
	            for (int j = 0; j < P - i; j++) {
	                linha += ">";
	            }
	            
	            
	            for (int j = 0; j < i; j++) {
	                linha += "#";
	            }
	            
	            for (int j = 1; j < i; j++) {
	                linha += "#";
	            }
	            
	            for (int j = 0; j < P - i; j++) {
	                linha += "<";
	            } 
	            
	            
	            System.out.println(linha);
	       
	          
	        }
	   }
	
	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        
	        System.out.println("Qual deve ser a altura da pirâmide? (número ente 1 e 20)");
	        
	        
	        int P = teclado.nextInt();
	        
	     
	        imprimirPiramide(P);
	  
	        teclado.close();
    }
}
