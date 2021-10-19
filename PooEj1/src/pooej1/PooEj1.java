/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej1;

/**
 *
 * @author Katsuo
 */
public class PooEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona erick = new Persona();
        Gato toffee = new Gato();
        
        Perro micky = new Perro();
        
        float conCantidadPienso = 300f;
        
        erick.acariciaA(toffee);
        
        //erick.alimentaA(toffee, conCantidadPienso);
        
        
        micky.seEncuentraCon(toffee);
        
        erick.acariciaA(micky);
        erick.alimentaA(micky, conCantidadPienso);
        
        // sigue con herencia y polimorfismo
    }
    
}
