package singleton;


public class Principal {
    public static void main(String[] args){
        Conexao conexao;
        conexao = Conexao.getInstance();
        Conexao conexao2;
        conexao2 = Conexao.getInstance();
    }
}
