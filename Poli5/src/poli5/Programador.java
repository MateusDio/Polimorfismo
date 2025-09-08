
package poli5;


class Programador extends Funcionario {
    double salarioHora;
    int horasTrabalhadas;

    public Programador(String nome, double salarioHora, int horasTrabalhadas) {
        super(nome);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    double calcularSalario() {
        return salarioHora * horasTrabalhadas; 
    }
}
