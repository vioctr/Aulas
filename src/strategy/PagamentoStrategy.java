package strategy;

public class PagamentoStrategy {
    public void calcularJuros(float valor, PagamentoI pagamentoI){
        pagamentoI.calcularJuros(valor);
    }
}
