/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoApp;

import java.util.Random;//importamos la clase Random a la clase Bot

/**
 *
 * @author Katsuo
 */
class Bot extends Jugador {
    
    private static final int RANGO_LIMITE = 3;
    
    
    public Bot(){
        nombre = "bob";
    }
    
    /**
     * Genera un numero aleatorio
     * @return 
     */
    int generaJugadaAleatoria() {
        Random generadorAleatorio = new Random(); // crear un objeto de clase random
        int rangoLimite = RANGO_LIMITE;// limite de numero aleatorio
        
        //generate random values from 0-2
        int numeroAleatorio = generadorAleatorio.nextInt(rangoLimite);
        
        numeroAleatorio++;// 1-3
        
        jugadaActual = numeroAleatorio;
        
        System.out.println("Numero aleatorio generado: " + numeroAleatorio);
        return numeroAleatorio;
    }

}
