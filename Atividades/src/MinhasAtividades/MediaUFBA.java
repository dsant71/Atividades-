package MinhasAtividades;

import java.util.Scanner;

public class MediaUFBA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner teclado = new Scanner(System.in);
    double av1, av2, av3, p1, p2, p3, mf;
        
        System.out.println("Insira a nota da sua primeira avaliação.");
            av1 = teclado.nextDouble();
        System.out.println("Insira a nota da segunda avaliação.");
            av2 = teclado.nextDouble();
        System.out.println("Insira a nota do seu trabalho final");    
            av3 = teclado.nextDouble();
        
                p1 = (av1 * 0.4);
                p2 = (av2 * 0.4);
                p3 = (av3 * 0.2);
                mf = (p1 + p2 + p3);
        if (mf >= 7.0) {  
            System.out.println("Você foi aprovado e sua média final foi: " + mf);
                } else if (mf >= 5.0) { 
                      System.out.println("Você está na recuperação e sua média final foi: " + mf);
                }     else { 
                          System.out.println("Você foi reprovado e sua média final foi: " + mf);
                }
                
              
                teclado.close();
            }
        
	
	
	
	
	
	
	}

