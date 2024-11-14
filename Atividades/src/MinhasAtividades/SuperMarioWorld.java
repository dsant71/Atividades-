package MinhasAtividades;
import java.util.Scanner;
public class SuperMarioWorld {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		        
		    System.out.println("Insira, respectivamente, o número de Star Coins, Mega Mushrooms, e Carapaças Koopa Azul ");  
		       
		    	int SC = teclado.nextInt();
		        int MM = teclado.nextInt();
		        int CK = teclado.nextInt();
		        
		       
		        if (SC == 30) {
		            System.out.println("PROXIMO MUNDO");
		        
		        } else if (SC > 30) { 
		        	System.out.println("Número de Star Coins inválido, tente novamente.");
		         	
		        	} else {
		         		int faltam_SC = 30 - SC;
		         		int faltam_MM = 6 - MM;
		         		int faltam_CK = 3 - CK;
		            
		         
		            System.out.println(faltam_SC + " " + faltam_MM + " " + faltam_CK);
		        }
		        
		        
		        teclado.close();
		    }
		}

