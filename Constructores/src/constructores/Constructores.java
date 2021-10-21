/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructores;

/**
 *
 * @author Katsuo
 */
public class Constructores {

    
    /*
        - Constructores
            - sobrecarga
        - Herencia
            - sobreescritura
    
    */
    
    
    /*
        problema: anotar estudiantes con dinstitos tipos de informacion
            - nombre
            - apellido
            - email
            - dni
            - padron
            - si se tuvo experiencia al programar
            - numero de contacto
            - domicilio
            - conoce a alguien que este estudiando en el establecimiento
    */
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Erick";
        String apellido = "Paiva";
        String email = "algo@email.com";
        String nombre2 = "Paula";
        int cantidadTarea = 2;
        
        Estudiante erick = new Estudiante(nombre, apellido, email);
        Estudiante paula = new Estudiante(nombre2);
        Estudiante sebastian = new Estudiante("Sebastian", 110000000, 7644334);
        
        Estudiante estudianteX = new Estudiante(11000000);        
        
        erick.pasarTarea(sebastian);
        sebastian.pasarTarea(paula);
        
        paula.pasarTarea(erick, "copialo pero que se vea distinto");
        
        paula.pasarTarea(erick, "copialo pero que se vea distinto", cantidadTarea);
        
    }
    
}
