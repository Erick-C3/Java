/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooej1;

/**
 *
 * @author Katsuo
 */
class Perro {

    private String nombre = "micky";

    void seEncuentraCon(Gato unGato) {
        System.out.println(nombre+" persigue a " + unGato.getNombre());
        unGato.seEncuentraCon(this);
    }

    String getNombre() {
        return nombre;
    }

    void serAcariciado() {
        System.out.println("El perro mueve la cola feliz");
    }

    float comer(float piensoParaPerro) {
        System.out.println(nombre + " esta comiendo "+ piensoParaPerro + "gr de pienso para perro");
        piensoParaPerro-= 200f;
        return piensoParaPerro;
    }
    
}
