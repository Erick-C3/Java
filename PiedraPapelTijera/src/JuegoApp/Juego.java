/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoApp;

/**
 *
 * @author Katsuo
 */
class Juego {
    
    private static final int SITUACION_EMPATE = 0;
    private static final int SITUACION_GANO_JUGADOR_UNO = 1;
    private static final int SITUACION_GANO_JUGADOR_DOS = 2;
    private static final int SITUACION_DEF = -1;    
    
    private static final int JUGADA_PIEDRA = 1;
    private static final int JUGADA_PAPEL = 2;
    private static final int JUGADA_TIJERA = 3;
    
    /**
     * Segun las reglas del juego Piedra, papel o tijera detecta quien gano
     * 
     * @param jugadorUno es el jugador uno
     * @param jugadorDos es el jugador dos
     * @return Dependiendo de la situacion devuelve:
     *          - SITUACION_EMPATE si es Empate
     *          - SITUACION_GANO_JUGADOR_UNO si  gano el jugadorUno
     *          - SITUACION_GANO_JUGADOR_DOS si gano el jugadorDos
     */
    int decimeQuienGano(Jugador jugadorUno, Jugador jugadorDos) {
        int resultado = SITUACION_DEF;
        if(jugadorUno.decimeJugadaActual() == jugadorDos.decimeJugadaActual()){
            resultado = SITUACION_EMPATE;
        }else if( jugadorUno.decimeJugadaActual() == JUGADA_PIEDRA && jugadorDos.decimeJugadaActual() == JUGADA_TIJERA){
            resultado = SITUACION_GANO_JUGADOR_UNO;
        }else if( jugadorUno.decimeJugadaActual() == JUGADA_PAPEL && jugadorDos.decimeJugadaActual() == JUGADA_PIEDRA){
            resultado = SITUACION_GANO_JUGADOR_UNO;
        }else if( jugadorUno.decimeJugadaActual() == JUGADA_TIJERA && jugadorDos.decimeJugadaActual() == JUGADA_PAPEL){
            resultado = SITUACION_GANO_JUGADOR_UNO;
        }else{
            resultado = SITUACION_GANO_JUGADOR_DOS;
        }
                
        return resultado;
    }
    
}
