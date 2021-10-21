/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciajava;

/**
 *
 * @author Katsuo
 */
public class Mascota {
    private String nombre;
    private String familiar;
    protected String raza;
    protected int edad;
    protected boolean estaAdoptado;
    private boolean estadoAdopcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamiliar() {
        return familiar;
    }

    public void setFamiliar(String familiar) {
        this.familiar = familiar;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    public void comer(){
        System.out.println("La mascota esta comiendo");
    }
    
    public void hacerRuido(){
        System.out.println("La mascota hace ruido");
    }    
    
    
    public void serAdoptado(){
        System.out.println("Voy a ser adoptado :D");
    }
}
