/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author Katsuo
 */
class Estudiante {
    
    private static final String NOMBRE_DEF = "nombre de estudiante por defecto";
    
    // atributos de la clase se inicializan con valores "nulos"
    private String nombre;
    private String apellido;
    private String email;
    private int numeroContacto;
    private int padron;
        
    public Estudiante(){
        
    }
        
    public Estudiante(String nombre, String apellido, String email){
        System.out.println("Creando estudiante");
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    public Estudiante(String nombre){
        System.out.println("Creando estudiante");
        this.nombre = nombre;
    }
    
    public Estudiante(String nombre, int numeroContacto, int padron){
        System.out.println("Creando estudiante");
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.padron = padron;
    }
    
    public Estudiante(int numeroContacto){
        System.out.println("Creando estudiante");
        this.numeroContacto = numeroContacto;
    }

    public void decirNombre() {
        System.out.println("Mi nombre es: " + nombre);
    }
    

    public void mostrarNumeroContacto() {
        System.out.println("Mi numero es: " + numeroContacto);
    }

    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }
    
    
    
    
    public void pasarTarea(Estudiante companiero) {
        System.out.println("Le estoy pasando la tarea a " + companiero.getNombre());
        //algoritmo para pasar la tarea
    }

    // sobrecarga 1
    public void pasarTarea(Estudiante companiero, String mensaje) {        
        System.out.println("Le estoy pasando la tarea a " + companiero.getNombre());
        System.out.println(mensaje);
    }
    
    // sobrecarga 2
    public void pasarTarea(Estudiante companiero, String mensaje, int cantidadTarea) {  
        System.out.println("Le estoy pasando " + cantidadTarea+ "tarea/s a " + companiero.getNombre());
        System.out.println(mensaje); 
    }
    
}
