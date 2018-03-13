
package Aula3;
import java.util.Scanner;
public class Produto {
    private String nome;
    private double preco;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void exibirProduto(){
        System.out.println("NOME " + this.nome);
        System.out.println("PRECO " + this.preco);
    }
   
    public Produto cadastrarProduto(Produto produto){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o nome do produto?");
        produto.setNome(leitor.nextLine());
        System.out.println("Qual o preço do produto?");
        produto.setPreco(leitor.nextDouble());
        return produto;
    }
}
