package MinhasAtividades;

import java.util.Scanner;
 

public class DroneEntrega {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
 
		int x1, y1, x2, y2; 
 

 System.out.println("Insira a longitude do local de entrega.");
     x1 = teclado.nextInt();
 System.out.println("Insira a latitude do local de entrega.");    
     y1 = teclado.nextInt();
 System.out.println("Insira a longitude em que o drone se encontra.");    
     x2 = teclado.nextInt();
 System.out.println("Insira a latitude em que o drone se encontra.");    
     y2 = teclado.nextInt(); 
    
     if (x1 == x2 && y1 == y2) {
         System.out.println("Soltar entrega.");}
	
	else {
    	 System.out.println("Não soltar entrega.");
     }
     
     
     
     
     teclado.close();
     
     
     
     
	}

}
