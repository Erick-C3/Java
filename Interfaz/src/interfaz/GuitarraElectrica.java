/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

/**
 *
 * @author Katsuo
 */
public class GuitarraElectrica extends Guitarra implements InstrumentoMusical {

    private boolean tieneAmplificador;
    
    public GuitarraElectrica() {
    }
    
    
    // comportamientos abstractos de guitarra
    @Override
    public void afinarCuerda() {
        System.out.println("Afinando cuerda para guitarra electrica");
    }

    @Override
    public void usarPua() {
        System.out.println("usamos la pua en una guitarra electrica");
    }
    
    
    // comportamientos del contrato interfaz
    @Override
    public void usar() {
        System.out.println("Usando guitarra electrica");
    }

    @Override
    public void guardar() {
        System.out.println("Guardando guitarra electrica");
    }

    @Override
    public void vender() {
        System.out.println("Vendiendo guitarra electrica");
    }
    
    
    
}
