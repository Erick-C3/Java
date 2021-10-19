/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga;


/*
    Tienda pizzeria
        - pizza
        - pizza con empanadas
        - pizza con gaseosa
        - pizza, empanadas y gaseosa

        - deberia poder recibir distintos tipos de pedidos
*/



/**
 *
 * @author Katsuo
 */
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizzeria pizzeriaBuenosAires = new Pizzeria();
        String pizza = "pizza de muza";
        int cantidadPizza = 3;
        String gaseosa = "Coca-cola";
        String empanada = "empanada de pollo";
        
        pizzeriaBuenosAires.realizarPedido(pizza);
        pizzeriaBuenosAires.realizarPedido(pizza, cantidadPizza);
        pizzeriaBuenosAires.realizarPedido(pizza, gaseosa);
        pizzeriaBuenosAires.realizarPedido(empanada);
        
        /* EXTRA PARA LA SIGUIENTE CLASE: crear la clase pizza, gaseosa y empanada
                                        además de actualizar el comportamiento 
                                        realiarPedido
        */
    }
    
}
