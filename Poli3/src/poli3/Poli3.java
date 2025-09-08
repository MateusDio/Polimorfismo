
package poli3;

public class Poli3 {

  
    public static void main(String[] args) {
        Conta c = new Contac(2500,140);
        double v = c.depositar();
         double v1 = c.sacar();
         System.out.println("Resultado ao depositar: " + v);
         System.out.println("Resultado ao sacar: " + v1);
         
         
         Conta p = new ContaP(2500,140);
        double p0 = p.depositar();
         double v9 = p.sacar();
         System.out.println("Resultado ao depositar: " + p0);
         System.out.println("Resultado ao sacar: " + v9);
    }
    
}
