package MinhasAtividades;
import java.util.Scanner;

public class PiramideDeTacas {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Insira o número de níveis que deseja na sua pirâmide (1-9)");
        
        int N = teclado.nextInt();
      

        
        for (int J = 1; J <= N; J++) {
            
            int espacos = N - J;

           
            int quantidade = J * 2 - 1 ;

            
            for (int i = 0; i < espacos; i++) {
                System.out.print(" ");
            }

           
            for (int i = 0; i < quantidade; i++) {
                System.out.print(J);
            }

           
            System.out.println();
      
        
      teclado.close();  
        
        }
    }
}
