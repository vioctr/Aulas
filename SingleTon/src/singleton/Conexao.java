package singleton;


public class Conexao {
    public static Conexao INSTANCIA;
    
    private Conexao(){
        
    }
    
    public static Conexao getInstance(){
        if(INSTANCIA == null){
            System.out.println("Criou instancia");
            INSTANCIA = new Conexao();
        }
        return INSTANCIA;
    }
    public void conectar(){
        System.out.println("...Conectado...");
    }
    public void desconectar(){
        System.out.println("...Desconectado...");
    }
}
