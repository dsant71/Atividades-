package MinhasAtividades2;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int h, m, s, n;
		
	        System.out.println("insira os segundos");
	        n = teclado.nextInt();
	        h = (n/3600);
	        m = ((n%3600)/60);
	        s = (n%60);
	        System.out.println("São " + h + "horas " + m  + " minutos e  " + s + " segundos");
	        
	        teclado.close();
	        
	        
	}
	

}
