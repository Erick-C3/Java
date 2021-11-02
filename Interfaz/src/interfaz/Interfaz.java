/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

/**
 *
 * @author Katsuo
 */
public class Interfaz {

    /*         
        - Interfaz
            * No se puede instanciar
            * No puede tener atributos
            * El encapsulamiento no puede ser privado
            * TODOS los comportamientos/metodos son abstractos
            * Se puede simular lo que es la herencia multiple
    
    
    
            - Guitarra    
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GuitarraElectrica miGuitarra = new GuitarraElectrica();
        
        miGuitarra.afinarCuerda();
        miGuitarra.verSiEstaAfinado();
        miGuitarra.vender();
        
    }
    
}
