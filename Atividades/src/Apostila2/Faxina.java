package Apostila2;

import java.util.Scanner;

public class Faxina {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadeLivros, quantidadeConsoantes, contador;
        String[] nomeLivros;
        String vogais = "aAeEiIoOuU";
        
      
        System.out.println("Insira a quantidade de livros encontrados na faxina e o número máximo de consoantes para doação, respectivamente");
        quantidadeLivros = teclado.nextInt();
        quantidadeConsoantes = teclado.nextInt();
        
        
        teclado.nextLine(); 
        
        
        nomeLivros = new String[quantidadeLivros];
        
       
        System.out.println("Insira o nome dos livros");
        for (int i = 0; i < quantidadeLivros; i++) {
            nomeLivros[i] = teclado.nextLine(); 
        }
        
  
        for (int j = 0; j < quantidadeLivros; j++) {
            String livro = nomeLivros[j];
            contador = 0;
            
            
            for (int k = 0; k < livro.length(); k++) {
                char c = livro.charAt(k);
                if (Character.isLetter(c) && vogais.indexOf(c) == -1) {
                    contador++;
                }
            }
            
          
            if (contador > quantidadeConsoantes) {
                System.out.println(0); 
            } else {
                System.out.println(1); 
            }
        }
        
        teclado.close(); 
    }
}