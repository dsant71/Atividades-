package MinhasAtividades2;

 

import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
      
        String drible = null, bloqueio = null, chute = null, goleiro = null;
        
      
        Scanner teclado = new Scanner(System.in);


       
        	
        	 System.out.println("Insira o lado que o atacante driblou (d para direita, e para esquerda):");
             drible = teclado.next();
             
             System.out.println("Insira o lado que o zagueiro bloqueou (d para direita, e para esquerda):");
            
             	bloqueio = teclado.next();
             	drible = drible.toLowerCase();
             	bloqueio = bloqueio.toLowerCase();
             	
             if ((drible.equals("d") || bloqueio.equals("d")) && (drible.equals("e") || bloqueio.equals("e"))) 
             	{
                 if ((drible.equals("d") && bloqueio.equals("d")) || (drible.equals("e") && bloqueio.equals("e"))) {
                 System.out.println("O atacante não conseguiu finalizar");
                } else  {
                 
                 System.out.println("Insira o lado que o atacante chutou (d para direita, e para esquerda):");
                 chute = teclado.next();
                 System.out.println("Insira o lado que o goleiro pulou (d para direita, e para esquerda):");
                 goleiro = teclado.next();
                 chute = chute.toLowerCase();
                 goleiro = goleiro.toLowerCase();}}
             
             else {
            	 System.out.println("Caractere inválido, tente novamente.");
            	 }
         
                 

                 if ((drible.equals("d") || bloqueio.equals("d")) && (drible.equals("e") || bloqueio.equals("e"))) {
                	 if ((chute.equals("d") && goleiro.equals("d")) || (chute.equals("e") && goleiro.equals("e"))) {
                         System.out.println("Defesa do goleiro!");
                     } else {
                        
                  System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOL!");}} 
               else { 
            	   System.out.println("Caractere inválido, tente novamnete");
               }
                    	 
                	 
                    	 
                    	 	
                     }
                	 
                
             } 
            
              

     
        




