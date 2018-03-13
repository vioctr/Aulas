package Aula3;
import java.util.ArrayList;
import java.util.Scanner;
public class Leilao {
    public static void main(){
        Scanner leitor = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        
        Usuario usuario = new Usuario();
        Produto produto = new Produto();
        
        produto.cadastrarProduto(produto);
        usuario.cadastrarUsuario(usuario);
        
        usuarios.add(usuario);
        produtos.add(produto);
        
        for(Produto p : produtos){
            int i = 0;
            p.exibirProduto();
            for(Usuario u : usuarios){
                u.exibirProduto();
                System.out.println("Deseja fazer um lance? Se sim, digite 1");
                int aux = leitor.nextInt();
                if(aux == 1){
                    u.fazerLance();
                }
                if(i == (usuarios.size()-1)){
                    System.out.println("Há mais algum lance? Se sim, digite 2");
                    int aux2 = leitor.nextInt();
                    if(aux2 == 2){
                        
                    }
                    else{
                        
                    }
                }
            }
        }
    }
            
}
