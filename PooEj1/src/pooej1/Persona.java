/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooej1;

/**
 *
 * @author Katsuo
 */
class Persona {

    
    /**
     * La persona acaricia a una mascota
     * @param mascota es un gato
     */
    void acariciaA(Gato mascota) {
        System.out.println("La persona esta acariciando a un gato");
        mascota.serAcariciado();
    }
    
    
    // sobrecarga del comportamiento/metodo acariciaA
    void acariciaA(Perro mascota) {
        System.out.println("La persona esta acariciando a un perro");
        mascota.serAcariciado();
    }

    
    void alimentaA(Gato mascota, float piensoParaGato) {
        System.out.println( "veo que quedo " + mascota.comer(piensoParaGato) + " gr de pienso" );
    }
    
    // sobrecarga del comportamiento/metodo alimentaA
    void alimentaA(Perro mascota, float piensoParaPerro) {
        System.out.println( "veo que quedo " + mascota.comer(piensoParaPerro) + "gr de pienso");
    }
    
}
