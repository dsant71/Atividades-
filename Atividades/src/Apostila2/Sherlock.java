package Apostila2;

import java.util.Scanner;

public class Sherlock {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String letras1, letras2, letras3, letras4, letras5, letras6;
		int folhas = 6;
		
		System.out.println("Insira as letras");
			letras1 = teclado.next();
			letras2 = teclado.next();
			letras3 = teclado.next();
			letras4 = teclado.next();
			letras5 = teclado.next();
			letras6 = teclado.next();
			
		System.out.println("A senha é:");	
		System.out.println( letras1.length() + "" + "" + letras2.length() + "" + letras3.length() + "" + letras4.length() + "" + letras5.length() + "" + letras6.length());
				
		
  }
}
