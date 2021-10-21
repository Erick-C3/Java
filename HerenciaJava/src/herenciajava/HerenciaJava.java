/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciajava;

/**
 *
 * @author Katsuo
 */
public class HerenciaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Gato toffee = new Gato();
        Perro micky = new Perro();
        
        toffee.comer();
        toffee.hacerRuido();
        
        micky.comer();
        micky.hacerRuido();
        
        toffee.serAdoptado();
        micky.serAdoptado();
        
    }
    
}
