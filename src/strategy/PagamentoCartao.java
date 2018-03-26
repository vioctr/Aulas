
package strategy;
public class PagamentoCartao implements PagamentoI{
     @Override
     public void calcularJuros(float valor){
         System.out.println((valor + (valor*1.1)) + "TOTAL ");
     }
}
