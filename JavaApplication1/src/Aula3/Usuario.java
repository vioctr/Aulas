package Aula3;
import java.util.Scanner;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Lance> lances = new ArrayList<>();
    
    public ArrayList<Lance> getLances() {
        return lances;
    }

    public void setLances(ArrayList<Lance> lances) {
        this.lances = lances;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibirProduto(){
        System.out.println("NOME " + this.nome);
    }
    
    /*(public static Lance cadastrarLance(){
        Lance lance = new Lance();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do lance?");
        lance.setValor(leitor.nextInt());
        return lance;
    }*/
    
    public void fazerLance(){
        Scanner leitor = new Scanner(System.in);
        Lance lance = new Lance();
        System.out.println("Qual o valor do lance?");
        lance.setValor(leitor.nextInt());
        lances.add(lance);
    }
    
    public Usuario cadastrarUsuario(Usuario usuario){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o nome do usuario?");
        usuario.setNome(leitor.nextLine());
        return usuario;
    }
}
