package strategyConta;

public class PagamentoDinheiro implements PagamentoI{
     @Override
     public void calcularJuros(Conta conta){
     if(conta.getQtd()>1){
         System.out.println("pagamento em dinheiro nao pode ser parcelado");
         System.out.println(((conta.getValor()*1.3)) + " TOTAL ");
     }
     }

}
