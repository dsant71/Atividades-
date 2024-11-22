package MinhasAtividades;

import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int altura1, altura2, altura3, maior = 0;
		
			System.out.println("Insira a altura em centímetros dos 3 amigos");
			altura1 = teclado.nextInt();
			altura2 = teclado.nextInt();
			altura3 = teclado.nextInt();
			
					  if (altura1 < 100 || altura1 > 200) {
						  System.out.println("Altura inválida.");
			
					} else if (altura2 < 100 || altura2 > 200) {
						  System.out.println("Altura inválida.");
					} else if (altura3 < 100 || altura3 > 200) {
						  System.out.println("Altura inválida.");
					
					} else {	  
						
						if (altura1 > maior) {
							maior = altura1;
						}
						if (altura2 > maior) {
							maior = altura2;
						}	
						if (altura3 > maior) {
							maior = altura3;
						}
			
		    System.out.println("O amigo mais alto possui " + maior + "cm de altura");
			
			
			
			
		}

	}

 }
