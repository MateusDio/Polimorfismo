
package poli4;


public class Poli4 {

    
        public static void main(String[] args) {
        
        Pagamento p1 = new PagamentoCartaoCredito();
        Pagamento p2 = new PagamentoBoleto();

        double valor = 100.0;

        System.out.println("Pagamento no Cartão: " + p1.calcularValor(valor));
        System.out.println("Pagamento no Boleto: " + p2.calcularValor(valor));
    }
}
    

