package MinhasAtividades;
import java.util.Scanner;
public class XpJedis {

	public static  void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int yoda = 0, luke = 0, ahsoka = 0, xp = 0, missoes = 0, totalYoda = 0, totalLuke = 0, totalAhsoka = 0;
	
		System.out.println("Insira a quantidade de missões que os jedis fizeram.");
			missoes = teclado.nextInt();
		System.out.println("Qual era a premiação em xp por cada missão?");	
			xp = teclado.nextInt();
	
	
		System.out.println("Quanto de xp Yoda possuia?");
			yoda  = teclado.nextInt();
		System.out.println("Quanto de xp Luke possuia?");
			luke  = teclado.nextInt();	
		System.out.println("Quanto de xp Ahsoka possuia?");
			ahsoka  = teclado.nextInt();	
			
				totalYoda = yoda + xp * missoes;	
				totalLuke = luke + xp * missoes;	
				totalAhsoka = ahsoka + xp * missoes;
	
		System.out.println("Yoda: " + totalYoda);
	    System.out.println("Luke: " + totalLuke);
	    System.out.println("Ahsoka: " + totalAhsoka);
	
	
	}
	

}
