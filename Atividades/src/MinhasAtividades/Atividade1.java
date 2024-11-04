package MinhasAtividades;



import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("Insira P1");
     String P1 = scanner.nextLine().trim();
        
 System.out.println("Insira P2"); 
     String P2 = scanner.nextLine().trim();

      P1 = P1.toUpperCase();
      P2 = P2.toUpperCase();
        if (P1.equals("N") || P2.equals("N")) {
            System.out.println("eliminado");
        } 
        
         else if (P1.equals(P2)) {
        	 System.out.println("eliminado");
         } 
            else 
          {
            System.out.println("classificado");
        }

        scanner.close();
        
    }
}