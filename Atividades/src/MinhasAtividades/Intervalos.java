package MinhasAtividades;

import java.util.Scanner;

public class Intervalos {

	public static void main(String[] args) {
	
	Scanner teclado = new Scanner (System.in);
	int n1, n2, n3, n4, ns; 
	
			System.out.println("Insira dois intervalos númericos.");
			n1 = teclado.nextInt();
			n2 = teclado.nextInt();
			n3 = teclado.nextInt();
			n4 = teclado.nextInt();
			
			System.out.println("Insira um número e diremos de qual intervalo ele faz parte.");
			ns = teclado.nextInt();
			
					if (n1 >= n2 || n3 >= n4) {
					System.out.println("Intervalo inválido");	
			
						
							} else if (ns > n1 && ns <= n2 && ns >= n3 && ns < n4  ) { 
							System.out.println("O número está presente nos dois intervalos.");
				
							} else if (ns > n1 && ns <= n2) {
							System.out.println("O número está presente no primeiro intervalo.");
							
							} else if (ns >= n3 && ns < n4 ) {
							System.out.println("O número está presente no segundo intervalo.");
					
					
					} else { 
					System.out.println("O número não está presente em nenhum dos dois intervalos.");

		
	teclado.close();	
		
		}
	}
}
