
package poli5;


public class Poli5 {

  
     public static void main(String[] args) {
        Funcionario f1 = new Gerente("Alice", 5000, 1500);
        Funcionario f2 = new Programador("Bob", 50, 160);

        System.out.println(f1.nome + " - Salário: " + f1.calcularSalario());
        System.out.println(f2.nome + " - Salário: " + f2.calcularSalario());
    }
}
