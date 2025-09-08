
package javaapplication30;


public class Quadrado extends FormGeo {
    double l;

    public Quadrado(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
     
   @Override
    double calcularArea() {
        return Math.pow(l, 2);
        
    }
    
}
