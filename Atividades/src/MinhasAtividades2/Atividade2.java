package MinhasAtividades2;




import java.util.Scanner;


public class Atividade2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
         int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, R = 0; 
         
         
         System.out.println("Expressão: (a+b) . (c-d) . (e+f)");
         System.out.println("          -----------------------");
         System.out.println("                      2");
	         System.out.println("Insira A");
                 A = teclado.nextInt();
                 System.out.println("Insira B");
                     B = teclado.nextInt();
                    System.out.println("Insira C");
                        C = teclado.nextInt();
                           System.out.println("Insira D");
                               D = teclado.nextInt();
                               System.out.println("Insira E");
                                   E = teclado.nextInt();
                                   System.out.println("Insira F");
                                       F = teclado.nextInt();
        R = ((A+B)*(C-D)*(E+F)/2); 
                                       
	    System.out.println("Eu sou FERA nas continhas e o resultado é " + R); 
	
        teclado.close();                               
	}

 
}
