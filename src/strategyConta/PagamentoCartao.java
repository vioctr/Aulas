
package strategyConta;
public class PagamentoCartao implements PagamentoI{
     @Override
     public void calcularJuros(Conta conta){
         float jurosAdicionais = (float) (conta.getQtd()*0.03);
         System.out.println(" TOTAL " + ((1+jurosAdicionais) * conta.getValor()));
     }
}
