package javaapplication30;

public class Poli1 {

    public static void main(String[] args) {
        FormGeo circ = new Circulo(2);
        double area = circ.calcularArea();
        System.out.println("Circulo: " + area);
        
        FormGeo ret = new Retangulo(2, 5);
        double area1 = ret.calcularArea();
        System.out.println("Retangulo: " + area1);
        
        FormGeo quad = new Quadrado(2);
        double area2 = quad.calcularArea();
        System.out.println("Quadrado: " + area2);
    }

}
