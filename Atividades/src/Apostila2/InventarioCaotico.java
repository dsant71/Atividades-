
package Apostila2;

import java.util.ArrayList;
import java.util.Scanner;

public class InventarioCaotico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int quantidade;
        String itemProcurado;
        
     
        ArrayList<String> inventario = new ArrayList<>();
        
        System.out.println("Insira a quantidade de itens do seu inventário:");
        quantidade = teclado.nextInt() + 1;
        
      
       
        
        System.out.println("Insira o nome dos itens do seu inventário:");
        for (int i = 0; i < quantidade; i++) {
            String item = teclado.nextLine();
            inventario.add(item);} 
        
        System.out.println("");
        System.out.println("Insira o nome do item que você está procurando:");
        itemProcurado = teclado.nextLine();
        
     
        if (inventario.contains(itemProcurado)) {
            System.out.println("O item está presente no seu inventário");
        } else {
            System.out.println("O item não está presente no seu inventário");
        }
        
        teclado.close();
        }
    }
