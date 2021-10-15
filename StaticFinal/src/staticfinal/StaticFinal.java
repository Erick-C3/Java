
package staticfinal;


public class StaticFinal {
    /*
    private int atributoNumero = 1;// solo para el objeto
                                   // se va a crear un atributo para cada objeto
    
    private final int CONST_NUMERO_OBJ = 2;// para el objeto
                                           // se va a crear una constante para cada objeto
    private static final int CONST_NUMERO_CLASE = 3;// para la clase principalmente y objetos
                                           // se va a crear SOLO una constante 

    // static lo podemos utilizar para inidicar que un atributo y/o metodo
       // pertenecen a la clase principalmente (no al objeto)
    
    // final(const) definir que un "contenedor" no pueda ser modificado luego de  inicializarse
    
    static final int CONSTANTE_NUMERO = 1;
    */
    
    public static void main(String[] args) {
        
        
        
        Gato toffee = new Gato();
        Gato.cantGatosCreados++;//aumento el valor del atributo de la clase Gato en 1
        Gato.mostrarCantidadGatosCreados();
        
        Gato chucky = new Gato();
        Gato.cantGatosCreados++;//aumento el valor del atributo de la clase Gato en 1
        Gato.mostrarCantidadGatosCreados();
        
        
        
        
        toffee.maullar();
        
        //uso de static con una constante
        int edadDefecto = Gato.RECIEN_NACIDO_EDAD;
        
        //uso de static con un metodo
        Gato.nombreClase();
        toffee.nombreClase();
    }
    
}
