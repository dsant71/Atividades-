package MinhasAtividades;

import java.util.Scanner;

public class QuadranteDeNaves {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int A = 0, B = 0, C = 0, D = 0, E = 0;
	int totalInimigas, totalAmigas;
		
		System.out.println("Insira o total de naves sondadas no quadrante");
			A = teclado.nextInt();
		System.out.println("Insira o número de naves amigas à esquerda, direita, frente e atrás da nave de Skywalker, respectivamente.");	
			B = teclado.nextInt();
			C = teclado.nextInt();	
			D = teclado.nextInt();
			E = teclado.nextInt();
				
			if  (A > 1000) {
				System.out.println("Muitas naves no quadrante, Skywalker foi abatido.");
					} else if (B + C + D + E > A) { 
							System.out.println("Era uma emboscada, surgiram novas naves durante a leitura. ");
			} else {

			    totalInimigas = A - (B + C + D + E);
				totalAmigas = A - totalInimigas;
		System.out.println("O número total de naves inimigas é " + totalInimigas + " e o número total de naves amigas é: " + totalAmigas );
		           
			
			
	teclado.close();
	
	
			}	
	}

}
