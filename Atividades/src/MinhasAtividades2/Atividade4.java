package MinhasAtividades2;

import java.util.Scanner;

public class Atividade4 {

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
