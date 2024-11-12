package MinhasAtividades;

import java.util.Scanner;

public class ClonesDoNaruto {

	public static void main(String[] args) {
		int N = 0;	
		Scanner teclado = new Scanner (System.in);
		
			System.out.println("Insira a quantidade ninjas inimigos ");
			N = teclado.nextInt();
			
			if ((N & N - 1) == 0) {
				System.out.println("Dattebayo");
				} else { 
					System.out.println("Tururuuuu");
				}
	
	
		teclado.close();
	
	
	}

}
