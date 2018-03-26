package strategy;

public class PagamentoDinheiro implements PagamentoI{
         @Override
     public void calcularJuros(float valor){
         System.out.println((valor + (valor*1.2)) + "TOTAL ");
     }
}
