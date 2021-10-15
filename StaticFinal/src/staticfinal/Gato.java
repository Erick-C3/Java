/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticfinal;

/**
 *
 * @author Katsuo
 */
public class Gato {
    
    public static int cantGatosCreados = 0;
    
    private int edad;
    private String nombre;
    
    //como crear una constante
    public static final int RECIEN_NACIDO_EDAD = 0;
    
    /**
     * asigna un nuevo valor para el atributo edad
     * @param edad >= RECIEN_NACIDO_EDAD
     */
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    /**
     * devuelve el atributo edad
     * @return la edad del gato
     */
    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Maullar
     */
    public void maullar(){
        System.out.println("Miau♪♫");
    }
    
    public static void nombreClase(){
        System.out.println("El nombre de la clase es gato");
    }
    
    public static void mostrarCantidadGatosCreados(){
        System.out.println("Gatos creados actualmente: " + cantGatosCreados );
    }
} 
