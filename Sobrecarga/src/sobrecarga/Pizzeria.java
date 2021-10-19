/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author Katsuo
 */
class Pizzeria {

    
    void realizarPedido(String pizza) {
        System.out.println("Saliendo orden de "+ pizza);
    }

    void realizarPedido(String pizza, int cantidad) {
        for(int i = 0 ; i < cantidad ; i++){
            System.out.println("Saliendo orden de "+ pizza + " nº" + (i+1));
        }       
    }

    void realizarPedido(String pizza, String gaseosa) {
        System.out.println("Saliendo orden de "+ pizza + " con "+ gaseosa);
    }
    
}
