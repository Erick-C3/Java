package menu;

import java.util.Scanner;

public class Menu {

    private static final int DEF_OPCION = -1;

    private static final String OPC_UNO_MSJ = "\nOpcion uno del menu [1]";
    private static final String OPC_DOS_MSJ = "\nOpcion dos del menu [2]";
    private static final String OPC_TRES_MSJ = "\nOpcion tres del menu [3]";
    private static final String OPC_SALIR_MSJ = "\nOpcion Salir [0]";

    private static final int OPC_UNO = 1;
    private static final int OPC_DOS = 2;
    private static final int OPC_TRES = 3;
    private static final int OPC_SALIR = 0;

    /**
     * Muestra el menu por consola
     */
    private static void mostrarMenu() {
        System.out.println(
                "\t***Menu***"
                + OPC_UNO_MSJ
                + OPC_DOS_MSJ
                + OPC_TRES_MSJ
                + OPC_SALIR_MSJ);
    }
    
    /**
     * Detecta la opcion actual recibida por el usuario
     * 
     * @param opcion recibida del usuario para el menu, tiene que estar actualizado
     */
    private static void detectarOpcion(int opcion) {
        switch (opcion) {
            case OPC_UNO:
                System.out.println("Detecto opcion uno");
                break;
            case OPC_DOS:
                System.out.println("Detecto opcion dos");
                break;
            case OPC_TRES:
                System.out.println("Detecto opcion tres");
                break;
            case OPC_SALIR:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }

    public static void main(String[] args) {
        int opcion = DEF_OPCION;
        Scanner opcionEscaner = new Scanner(System.in);
        
        do {
            mostrarMenu();
            System.out.println("\nIngrese opcion");
            opcion = opcionEscaner.nextInt();
            detectarOpcion(opcion);            
            
        } while (opcion != OPC_SALIR);
    }

}
