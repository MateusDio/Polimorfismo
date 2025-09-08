package poli3;

public class Contac extends Conta {

    double saldo, v;

    public Contac(double saldo, double v) {
        this.saldo = saldo;
        this.v = v;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    @Override
    double sacar() {
        return saldo - v;

    }

    @Override
    double depositar() {
        return saldo + v;

    }
}
