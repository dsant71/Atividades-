package Apostila2;


import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        System.out.println("Insira a palavra e o progama irá verificar se ela é um palíndromo ou não");
        String palavra = scanner.nextLine();
        
       
        if (ehPalindromo(palavra)) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        
        scanner.close();
    }
    
    public static boolean ehPalindromo(String palavra) {
        int n = palavra.length();
        for (int i = 0; i < n / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
