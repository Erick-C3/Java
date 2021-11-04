/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturaarchivos;

import java.io.File;// importo lo que es in File(archivo)
import java.io.FileWriter;// importo lo que es FileWriter(para lectura de archivo)
import java.io.IOException;// importo lo que es la excepcion de input output

/**
 *
 * @author Katsuo
 */
public class Archivo {

    private static final String EXTENSION_DEF = ".txt";
    private static final String RUTA_DEF = "./src/lecturaarchivos/";

    /**
     * Crea un archivo 
     *
     * @param conEsteNombre es el nombre del nuevo archivo sin extension
     */
    public void creaUnArchivo(String conEsteNombre) {
        try {// en el try vamos a probar el codigo

            // ./archivosCreados/nuevoArchivo.txt
            File nuevoArchivo = new File(RUTA_DEF + conEsteNombre + EXTENSION_DEF);//al crear el archivo se agrega como argumento el nombre del archivo y extension

            if (nuevoArchivo.createNewFile()) {//creamos el archivo y devuelve true si se creo correctamente, caso contrario devuelve false si existe
                System.out.println("Archivo creado: " + nuevoArchivo.getName());
            } else {
                System.out.println("El archivo existe actualmente.");
            }

        } catch (IOException e) { // en el catch vamos a atrapar el error
            System.out.println("Algo malio sal." + e);//mensaje de error
            e.printStackTrace(); // imprime el detalle del problema
        }

    }

    /**
     * Escribe en un archivo con un mensaje por defecto
     * @param conEsteNombre es el nombre del archivo solicitado a modificar
     */
    public void escribirEnUnArchivo(String conEsteNombre) {

        try {
            FileWriter archivoAModificar = new FileWriter(RUTA_DEF + conEsteNombre + EXTENSION_DEF);//busca el archivo, si no lo encuentra lo crea, y guarda en el objeto
            //buenas practicas: el mensaje a agregar no deberia ser un valor literal
            archivoAModificar.write("Este es otro mensaje agregado en codigo");//comportamiento para escribir en el archivo
            //IMPORTANTE CERRAR EL ARCHIVO UNA VEZ TERMINO SU USO
            archivoAModificar.close();//cerrar el archivo por que no lo voy a usar más 

            System.out.println("Se completo la escritura sin problema.");
        } catch (IOException e) {
            System.out.println("Algo malio sal.");
            e.printStackTrace();
        }

    }

    /**
     * Escribe en un archivo y agrega un mensaje en especifico
     * @param conEsteNombre es el nombre del archivo solicitado a modificar
     * @param yEsteMensaje es el texto a agregar en el archivo
     */
    public void escribirEnUnArchivo(String conEsteNombre, String yEsteMensaje) {

        try {
            FileWriter archivoAModificar = new FileWriter(RUTA_DEF + conEsteNombre + EXTENSION_DEF);//busca el archivo, si no lo encuentra lo crea, y guarda en el objeto
            archivoAModificar.write(yEsteMensaje);//comportamiento para escribir en el archivo
            //IMPORTANTE CERRAR EL ARCHIVO UNA VEZ TERMINO SU USO
            archivoAModificar.close();//cerrar el archivo por que no lo voy a usar más 

            System.out.println("Se completo la escritura sin problema.");
        } catch (IOException e) {
            System.out.println("Algo malio sal.");
            e.printStackTrace();
        }
    }

}
