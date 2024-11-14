package MinhasAtividades;

import java.util.Scanner;

public class Pedagio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int distanciaKm, distanciaPedagio, valorKm, valorPedagio, total;
	    
			
			System.out.println("insira a distância que será percorrida e a distância fixa entre os pedágios, respectivamente.");
				distanciaKm = teclado.nextInt();
				distanciaPedagio = teclado.nextInt();
			System.out.println("Agora insira o valor por KM e o valor cobrado em cada pedágio.");	
         		valorKm = teclado.nextInt();
         		valorPedagio = teclado.nextInt();
         	
         		total = (distanciaKm * valorKm + (distanciaKm / distanciaPedagio) * valorPedagio);
         	System.out.println("O total pago pela Chapéuzinho será " + total);
	
	
	
	
	
      teclado.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
