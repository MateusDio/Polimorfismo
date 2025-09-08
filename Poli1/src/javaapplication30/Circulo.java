
package javaapplication30;


public class Circulo extends FormGeo {
    int n1;
    
   

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }


    public Circulo(int n1) {
        this.n1 = n1;
        
    }

 double resultado1 = Math.pow(n1, 2);

   
    
    
    
   @Override
    double calcularArea() {
           return 3.14 * Math.pow(n1, 2);
    }
}

    

