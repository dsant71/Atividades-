package Apostila2;

import java.util.Scanner;

public class CacandoPokemon {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eixoY, eixoX, tipoPokemon;

        System.out.println("Quantos slots possui a sua pokédex? (valores do eixo X e Y da matriz)");
        eixoX = teclado.nextInt();
        eixoY = teclado.nextInt();

        int[][] matriz = new int[eixoX][eixoY];

        System.out.println("Identifique os tipos de pokémon presente nos slots (Utilize 0 para slots vazios)");
        for (int i = 0; i < eixoX; i++) {
            for (int j = 0; j < eixoY; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("A sua pokédex se encontra assim:");
        for (int i = 0; i < eixoX; i++) {
            for (int j = 0; j < eixoY; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Insira o tipo de pokémon que você deseja quantificar");
        tipoPokemon = teclado.nextInt();
        int contador = 0;

        for (int k = 0; k < eixoX; k++) {
            for (int l = 0; l < eixoY; l++) {
                if (matriz[k][l] == tipoPokemon) {
                    contador++;
                }
            }
        }

        System.out.println("Foram capturados " + contador + " pokémons do tipo " + tipoPokemon);

        teclado.close();
    }
}