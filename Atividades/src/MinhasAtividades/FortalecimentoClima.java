package MinhasAtividades;
import java.util.Scanner;

public class FortalecimentoClima {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o número de pokémons que você deseja calcular o fortalecimento.");
       
        int quantidade = teclado.nextInt();
        
      
        for (int i = 0; i < quantidade; i++) {
            
        System.out.println("Insira, respectivamente, o nível de poder e o quanto será aumentado com o fortalecimento por clima");   
        	
        	int poder = teclado.nextInt();
            int fortalecimento = teclado.nextInt();
            
            
            int danoFinal = poder + fortalecimento;
            
            
            System.out.println(danoFinal);
        }
        
        
        teclado.close();
    }
}
