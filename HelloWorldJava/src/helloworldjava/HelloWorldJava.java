
package helloworldjava;

//importar funcionalidades

import java.util.Scanner;



public class HelloWorldJava {

    /*
        - Preguntas de java
        - Como escribir y leer
        - Ejemplo de un menu 
        - Metodos/funciones (final static)
    */
    
    private static final int DEF_NUMERO = -1; // receta para una constante int
    private static final float DEF_NUMERO_FLOAT = 0.1f;
    private static final char DEF_CARACTER = 'x';
    private static final String DEF_PALABRA = "def palabra";
    private static final boolean DEF_BOOLEANO = false;
    
    
    public static void main(String[] args) {
        int numero = DEF_NUMERO;
        float numeroFloat = DEF_NUMERO_FLOAT;
        char caracter = DEF_CARACTER;
        String palabra  = DEF_PALABRA;
        boolean booleano = DEF_BOOLEANO;
        
        Scanner infoRecibida = new Scanner(System.in);
        
        System.out.println("Ingrese numero");
        numero = infoRecibida.nextInt(); // recibir un int en consola
        
        System.out.println("Ingrese float");
        numeroFloat = infoRecibida.nextFloat();
        
        System.out.println("Ingrese char");
        caracter = infoRecibida.next().charAt(0);// scanf(" %c", &caracter);
        
        infoRecibida.nextLine();//limpia el buffer de consola        
        
        System.out.println("Ingrese string");
        palabra = infoRecibida.nextLine();
        
        System.out.println("Ingrese boolean");
        booleano = infoRecibida.nextBoolean();
        
        System.out.println("\nIngresaste el numero: "+ numero);
        System.out.println("Ingresaste el float: "+ numeroFloat);
        System.out.println("Ingresaste el char: "+ caracter);
        System.out.println("Ingresaste el String: "+ palabra);
        System.out.println("Ingresaste el boolean: "+ booleano);
    }
    
}
