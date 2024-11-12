package MinhasAtividades;
import java.util.Scanner;
public class BolinhasDeGude {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int F, G;
	int totalBolinhas = 0;	
		System.out.println("Insira o número de familiares e o número de bolinhas de gude que o primeiro familiar deu, respectivamente. ");
			F = teclado.nextInt();
			G= teclado.nextInt();
			
			for (int i = 0; i < F; i++) {
	            totalBolinhas += G * (int)Math.pow(2, i);
	        }
		
	
			System.out.println(totalBolinhas);
	
	
	teclado.close();
	
	}

}
