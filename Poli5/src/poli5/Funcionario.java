
package poli5;


abstract class Funcionario {
    String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

   
    abstract double calcularSalario();
}
