package ProjetoPOO;

public class ExibeMaiusculo implements Exibidor{
    @Override
    public void Exibe(String palavra){
         System.out.println("Palavra somente com letras maíusculas: " + palavra.toUpperCase());
    }
}
