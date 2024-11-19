package MinhasAtividades;

import java.util.Scanner;

public class DesafioTatico {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        int P = teclado.nextInt();
        
      
        int S = teclado.nextInt();
        
       
        for (int i = 0; i < P; i++) {
            int somaAtaque = 0;
            int somaDefesa = 0;
            
            
            for (int j = 0; j < S; j++) {
                int ataque = teclado.nextInt();  
                int defesa = teclado.nextInt();   
                
                somaAtaque += ataque;  
                somaDefesa += defesa;  
            } 
            
         
            System.out.println(somaAtaque + " " + somaDefesa);
        }
        
       
        teclado.close();
    }
}


