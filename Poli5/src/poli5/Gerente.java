
package poli5;


class Gerente extends Funcionario {
    double salarioBase;
    double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome);
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    double calcularSalario() {
        return salarioBase + bonus; 
    }
}
  
