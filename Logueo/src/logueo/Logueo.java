package logueo;

import java.util.Scanner;

public class Logueo {

    /*
        * Hacer un ejercicio estilo programacion estructurada en JAVA
        * PDF JAVA INPUT (listo)
        * static - final (POO)
            - Gato
        * Ejercicio de Gato, Perro y Persona      
     */
 /*
        Logueo
        
        - if para ver si el usuario realmente puede ingresar
                - verificamos el nombre y contraseña
        - for para permitir una cantidad de veces conocida el logueo al usuario
        - while o do while para permitir una cantidad desconocida de veces 
          el logueo al usuario
        - programa mas complejo, el cual tendria mas funcionalidades 
     */
 /*
        while
            
            requisitos:
            + permitir ingresar al usuario (if)
                + con condicion de verificar credenciales de la cuenta
            - repetir la oportunidad hasta que verifique (do-while) 
            - extra: disponer al usuario de la opcion "salir" - "me canse de intentar"    
            - extra 2: implementar la verificacion para dos usuarios
     */
    private static final String NOMBRE_USUARIO_VERF = "erick";
    private static final String CONTRASENIA_USUARIO_VERF = "123";

    private static final String NOMBRE_USUARIO_DEF = "def nombre usuario";
    private static final String CONTRA_USUARIO_DEF = "def contrasenia usuario";

    private static final boolean DEF_ESTADO_VERIF = false;
    private static final boolean NO_LOGRO_VERIF = false;
    private static final boolean LOGRO_VERIF = true;

    
    
    /**
     * Verifica las credenciales ingresadas por el usuario 
     * 
     * @param nombreUsuario tiene que estar correctamente actualizado
     * @param contraseniaUsuario tiene que estar correctamente actualizada
     * @return estadoVerificacion del logueo
     */
    private static boolean verificarCredenciales(String nombreUsuario, String contraseniaUsuario) {
        boolean estadoVerificacion = DEF_ESTADO_VERIF;
        if (nombreUsuario.equals(NOMBRE_USUARIO_VERF)) {
            System.out.println("NOMBRES SON IGUALES");
            if (contraseniaUsuario.equals(CONTRASENIA_USUARIO_VERF)) {
                System.out.println("CONTRASEÑA SON IGUALES");
                System.out.println("Bienvenido " + nombreUsuario + "!!!");
                estadoVerificacion = LOGRO_VERIF;
            }
        } else {
            System.out.println("Error: usuario y/o contraseña no coinciden");
            estadoVerificacion = NO_LOGRO_VERIF;
        }
        
        return estadoVerificacion;
    }

    public static void main(String[] args) {
        String nombreUsuario = NOMBRE_USUARIO_DEF;
        String contraseniaUsuario = CONTRA_USUARIO_DEF;
        boolean estadoVerificacion = DEF_ESTADO_VERIF;

        Scanner credencialesEscaner = new Scanner(System.in);

        do {
            //ingreso de informacion por consola
            System.out.println("Ingrese nombre de usuario");
            nombreUsuario = credencialesEscaner.next();

            System.out.println("Ingrese contraseña de usuario");
            contraseniaUsuario = credencialesEscaner.next();

            //verificacion de credenciales
            estadoVerificacion = verificarCredenciales(nombreUsuario, contraseniaUsuario);
        } while (!estadoVerificacion);

    }

}
