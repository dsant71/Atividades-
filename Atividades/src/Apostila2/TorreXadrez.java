package Apostila2;

import java.util.Scanner;

public class TorreXadrez {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int[][] tabuleiro = new int[8][8];
        
     
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = teclado.nextInt();
            }
        }
        
        System.out.println("Insira o mapa do tabuleiro");
        
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        
     
        int adversariosDerrotados = contarAdversarios(tabuleiro, x, y);
        
        
        System.out.println(adversariosDerrotados);
        
        teclado.close();
    }

   
    

    public static int contarAdversarios(int[][] tabuleiro, int x, int y) {
        int adversarios = 0;

        int[][] direcoes = {
            {-1, 0},  
            {1, 0},   
            {0, -1},  
            {0, 1}   
        };

        for (int[] direcao : direcoes) {
            int i = x;
            int j = y;

            while (true) {
                i += direcao[0];
                j += direcao[1];

                if (i < 0 || i >= 8 || j < 0 || j >= 8) {
                    break; 
                }

                if (tabuleiro[i][j] == 1) {
                    break;
                }

                if (tabuleiro[i][j] == 2) {
                    adversarios++;
                    break; 
                }
            }
        }

        return adversarios;
    }
}

   