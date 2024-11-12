package MinhasAtividades;

import java.util.Scanner;

public class Titas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int titas;
	Scanner teclado = new Scanner(System.in);	

	    System.out.println("Insira o número de titãs: ");
	    titas = teclado.nextInt();
	   int tropas = (titas-20)/5; 
	    System.out.println("O número de soldados necessários será:" + tropas);
	
	    teclado.close();
	
	}


	
}
