
package poli4;


class PagamentoCartaoCredito extends Pagamento {
    @Override
    double calcularValor(double valorBase) {
        
        return valorBase * 1.02;
    }
}
