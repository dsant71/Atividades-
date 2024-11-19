package Apostila2;

import java.util.Scanner;

public class CampoDeAboboras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int N = teclado.nextInt();
        
    
        int[][] matriz = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
        
 
        int X = teclado.nextInt();
        int Y = teclado.nextInt();
        
        
        int pesoHarry = 0;
        int pesoRon = 0;
        
       
        for (int j = 0; j < N; j++) {
            pesoHarry += matriz[X][j];
        }
        
        
        for (int i = 0; i < N; i++) {
            pesoRon += matriz[i][Y];
        }
        
       
        if (X <= Y) {
            pesoHarry -= matriz[X][Y];
        } else { 
            pesoRon -= matriz[X][Y]; 
        }
        
   
        System.out.println("Harry " + pesoHarry);
        System.out.println("Ron " + pesoRon);
    }
}
