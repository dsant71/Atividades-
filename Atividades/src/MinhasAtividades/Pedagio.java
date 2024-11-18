package MinhasAtividades;

import java.util.Scanner;

public class Pedagio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int distanciaKm = 0, distanciaPedagio = 0, valorKm = 0, valorPedagio = 0, total = 0;
	    
			
			
		
			System.out.println("insira a distância que será percorrida e a distância fixa entre os pedágios, respectivamente.");
			distanciaKm = teclado.nextInt();
			distanciaPedagio = teclado.nextInt();
			
							
							if (distanciaKm < 0 || distanciaPedagio < 0 || distanciaKm > 1000 || distanciaPedagio > 1000) {
							System.out.println("Distância inválida, tente novamente.");
							}
			
			else {
				
			System.out.println("Agora insira o valor por KM e o valor cobrado em cada pedágio.");	
			valorKm = teclado.nextInt();
			valorPedagio = teclado.nextInt();
							} 
				
							if (valorKm < 0 || valorPedagio < 0 || valorKm > 100 || valorPedagio > 1000) {
							System.out.println("Valor inválido");	
							}
				
			
			else {				
			total = (distanciaKm * valorKm + (distanciaKm / distanciaPedagio) * valorPedagio);
         	System.out.println("O total pago pela Chapéuzinho será " + total);
			}
				
	
	
	
      teclado.close();
	
	
	
	}

}

