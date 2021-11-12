/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoApp;

/**
 *
 * @author Katsuo
 */
public class Jugador {   
    
    private static final int JUGADA_PIEDRA = 1;
    private static final int JUGADA_PAPEL = 2;
    private static final int JUGADA_TIJERA = 3;
    
    protected int jugadaActual;
    protected String nombre;
    
    
    void eligioPiedra() {
        jugadaActual = JUGADA_PIEDRA;
    }

    void eligioPapel() {
        jugadaActual = JUGADA_PAPEL;
    }

    void eligioTijera() {
        jugadaActual = JUGADA_TIJERA;
    }

    int decimeJugadaActual() {
        return jugadaActual;
    }

    String decimeTuNombre() {
        return nombre;
    }
    
    
    void ahoraTeLlamas(String nombre) {
        this.nombre = nombre;
    }
}
