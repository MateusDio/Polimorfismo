
package poli4;


class PagamentoBoleto extends Pagamento {
    @Override
    double calcularValor(double valorBase) {
        
        return valorBase * 0.95;
    }
}
