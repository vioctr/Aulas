package strategyConta;

public class PagamentoStrategy {
    public void calcularJuros(Conta conta, PagamentoI pagamentoI){
        pagamentoI.calcularJuros(conta);
    }
}
