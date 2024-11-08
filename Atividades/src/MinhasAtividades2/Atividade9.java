package MinhasAtividades2;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

      System.out.println("Digite a quantidade de pokémons presentes na pokédex");
        int K = teclado.nextInt();
        int J = teclado.nextInt();
        int H = teclado.nextInt();

     System.out.println("Digite a quantidade de pokémons capturados");  
        int K_new = teclado.nextInt();
        int J_new = teclado.nextInt();
        int H_new = teclado.nextInt();

     
        K += K_new;
        J += J_new;
        H += H_new;

      System.out.println("Agora existem");
        System.out.println(K + " " + J + " " + H);
      System.out.println("pokémons na pokédex");
      
        teclado.close();
    }
}
