/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraccion;

/**
 *
 * @author Katsuo
 */
public class Abstraccion {
    
    /*
         - Abstraccion
            * Metodo abstracto no tiene el  ambito implementado
            * Una clase que tiene al menos 1 metodo abstracto se convierte
              en una clase abstracta
            * Una clase abstracta NO SE PUEDE INSTANCIAR
            
            
            - Celulares
    
    
    */
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Celular superCelular = new Celular();//superclase
        
        // subclases que heredan de Celular
        LG miCelular = new LG();
        Samsung otroCelular = new Samsung();
        
        miCelular.mostrarDetalleModelo();
        otroCelular.mostrarDetalleModelo();
        
        
        
    }
    
}
