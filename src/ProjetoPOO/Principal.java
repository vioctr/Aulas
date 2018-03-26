package ProjetoPOO;

import java.util.Scanner;

public class Principal {
     public static void main(String[] args){
         
         Scanner leitor =  new Scanner(System.in);
         System.out.println("Digite a palavra/");
         String p = leitor.nextLine();
         Exibidor e1 = new ExibeMaiusculo();
         Exibidor e2 = new ExibeMin();
         Exibe exibe = new Exibe();
         exibe.exibeContando(e1, p);
         exibe.exibeContando(e2, p);
    }
     
}
