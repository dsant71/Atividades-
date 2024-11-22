package Apostila2;

import java.util.Scanner;

public class Sherlock {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String folha1, folha2, folha3,  folha4, folha5, folha6; 

	System.out.println("Insira, respectivamente, as letras encontradas em cada folha");
	folha1 = teclado.nextLine();
	folha2 = teclado.nextLine();
	folha3 = teclado.nextLine();
	folha4 = teclado.nextLine();
	folha5 = teclado.nextLine();
	folha6 = teclado.nextLine();
	
	
	System.out.println("A senha é: ");
	System.out.println(folha1.length()+ "" + "" + folha2.length()+ "" + folha3.length() + "" + folha4.length() + "" + folha5.length() + "" + folha6.length());
	
	
	
	
	}

}
