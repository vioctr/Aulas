package strategyConta;


public class Principal{
    public static void main(String[] args){
        Conta conta1 = new Conta();
        conta1.setQtd(6);
        conta1.setValor(1000);
        
        
        PagamentoStrategy ps = new PagamentoStrategy();
        ps.calcularJuros(conta1, new PagamentoCartao());
    }
}
//if(conta.getQuantidade()>1{
//sysout(pagamento em dinheiro nao pode ser parcelado)
//}