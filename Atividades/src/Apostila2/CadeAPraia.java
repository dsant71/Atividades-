package Apostila2;
import java.util.Scanner;

public class CadeAPraia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] mapa = new char[10][10];

        System.out.println("Digite o mapa 10x10 (use '*' para água e 't' para terra):");
        for (int i = 0; i < 10; i++) {
            String linha = scanner.nextLine();
            String[] caracteres = linha.split(" "); // Dividir a linha pelos espaços
            for (int j = 0; j < 10; j++) {
                mapa[i][j] = caracteres[j].charAt(0); // Pegar o primeiro caractere de cada parte
            }
        }

        char[][] novoMapa = transformarPraia(mapa);

        // Imprimir o mapa corrigido
        System.out.println("Mapa corrigido:");
        for (char[] linha : novoMapa) {
            for (char c : linha) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static char[][] transformarPraia(char[][] mapa) {
        int n = mapa.length;
        int m = mapa[0].length;
        char[][] novoMapa = new char[n][m];

        // Copiar o mapa original para o novo mapa
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                novoMapa[i][j] = mapa[i][j];
            }
        }

        // Verificar cada posição do mapa
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mapa[i][j] == 't') {
                    // Verificar se está em contato direto com a água
                    if (ehAgua(mapa, i - 1, j) || ehAgua(mapa, i + 1, j) || ehAgua(mapa, i, j - 1) || ehAgua(mapa, i, j + 1)) {
                        novoMapa[i][j] = 'p';
                    }
                }
            }
        }

        return novoMapa;
    }

    public static boolean ehAgua(char[][] mapa, int x, int y) {
        return x >= 0 && x < mapa.length && y >= 0 && y < mapa[0].length && mapa[x][y] == '*';
    }
}