/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturaarchivos;

/**
 *
 * @author Katsuo
 */
public class LecturaArchivos {
    
    /*
        Como maneajar un archivo
            - .txt (archivo binario)
            - crear - escribir - leer - eliminar 
    
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Archivo operadorArchivo = new Archivo();
        
        String conEsteNombre = "nuevoArchivoConCodigo";
        String yEsteMensaje = "hola!";
        
        operadorArchivo.creaUnArchivo(conEsteNombre);
        
        //operadorArchivo.escribirEnUnArchivo(conEsteNombre); 
        operadorArchivo.escribirEnUnArchivo(conEsteNombre, yEsteMensaje);        
        
    }
    
}
