
package poli2;


public class Poli2 {

   
    public static void main(String[] args) {
        Animal car = new Cachorro();
        car.emitirSom();
        car.mover();
        
        Animal cat = new Gato();
        cat.emitirSom();
        cat.mover();
        
        Animal pass = new Passaro();
        pass.emitirSom();
        pass.mover();
    }
    
}
