/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author mauri
 */
public class Retangulo  extends FormGeo{
    double b,h,a;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Retangulo(double b, double h) {
        this.b = b;
        this.h = h;
        
        

    }
    @Override
    double calcularArea() {
        return b * h;
        
    }

 
    
}
