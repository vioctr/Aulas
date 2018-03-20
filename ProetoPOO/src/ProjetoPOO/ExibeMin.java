package ProjetoPOO;

public class ExibeMin implements Exibidor{
    @Override
    public void Exibe(String palavra){
        System.out.println("Palavra somente com letras minusculas: " + palavra.toLowerCase());
     }
}
