/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooej1;

/**
 *
 * @author Katsuo
 */
class Gato {

    private String nombre = "toffee";

    
    /**
     * Comportamiento del gato al ser acariciado
     */
    void serAcariciado() {
        System.out.println("Purrr ♪");
    }

    
    float comer(float piensoParaGato) {
        System.out.println("Comiendo "+ piensoParaGato +"gr de pienso para gato");
        piensoParaGato -= 150f;// de que manera come el gato
        return piensoParaGato;
    }

    String getNombre() {
        return nombre;
    }

    void seEncuentraCon(Perro unPerro) {
        System.out.println( nombre + " se encontro con "+ unPerro.getNombre());
        System.out.println("Entonces escapa D:");
    }
    
}
