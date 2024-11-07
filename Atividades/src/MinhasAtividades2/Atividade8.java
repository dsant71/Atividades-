package MinhasAtividades2;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teclado = new Scanner (System.in);

int P, N;
 P = 0;       
       
     System.out.println("Insira o poder do primeiro personagem");
        N = teclado.nextInt();
        if (N > P) {
            P = N;
        }

       
        if (N > 10000) {
            System.out.println("Número inválido. Tente novamente.");
        } else {
         
            System.out.println("Insira o poder do segundo personagem");
            N = teclado.nextInt();
            if (N > P) {
                P = N;
            }

           
            if (N > 10000) {
                System.out.println("Número inválido. Tente novamente.");
            } else {
                
                System.out.println("Insira o poder do terceiro personagem");
                N = teclado.nextInt();
                if (N > P) {
                    P = N;
                }

                if (N > 10000) {
                    System.out.println("Número inválido. Tente novamente.");
        }   
               
}                     
                    System.out.println("Insira o poder do quarto personagem");
                        N = teclado.nextInt();
                        if (N > P) {
                            P = N;
                        }

                        if (N > 10000) {
                             System.out.println("Número inválido. Tente novamente.");}
                         else {
                        	 System.out.println("Insira o poder do quinto personagem.");
                        	 N = teclado.nextInt();
                        	 if (N > P) {
                        		    P = N;
                        		}

                        	 if (N > 10000) {
                            	 System.out.println("Numero inválido");
                             }
                                  System.out.println("O personagem mais forte tem " + P + " de nível de poder");
       
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 
                        	 teclado.close();
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
