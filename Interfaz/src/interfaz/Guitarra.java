/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

/**
 *
 * @author Katsuo
 */
abstract class Guitarra {
    protected String marca;
    protected float  precio;
    protected String tipoGuitarra;
    protected boolean estaAfinado;
    
    /**
     * afina la cuerdda de la guitarra
     */
    public abstract void afinarCuerda();
    
    
    /**
     * usa la pua de la guitarra
     */
    public abstract void usarPua();
    
    /**
     * Muestra si la guitarra esta afinada
     */
    public void verSiEstaAfinado(){
        if(estaAfinado){
            System.out.println("Si, esta afinado");
        }else{
            System.out.println("No, no esta afinado");
        }
    }
}
