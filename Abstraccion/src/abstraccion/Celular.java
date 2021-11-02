/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraccion;

/**
 *
 * @author Katsuo
 */
abstract class Celular {
    
    private float capacidadBateria;
    private String modelo;
    private boolean estaApagado;
    
    
    /**
     * Muestra detalles del modelo (celular)
     */
    public abstract void mostrarDetalleModelo();//comportamiento/metodo abstracto
    
    
    public void cargarBateria(){
        System.out.println("Cargando bateria de celular");
    }
}
