package MinhasAtividades;

import java.util.Scanner;

public class ContadorDeSegundos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int h, m, s, n;

    
        System.out.println("Insira os segundos:");
        n = teclado.nextInt();

       
        if (n >= 1 && n <= 1000000) {

           
            h = n / 3600; 
            m = (n % 3600) / 60; 
            s = n % 60; 

            System.out.println("São " + h + " horas " + m + " minutos e " + s + " segundos.");
        } else {
            
            System.out.println("Erro: O valor de N deve estar entre 1 e 10000000");
        }

        teclado.close();
    }
}
