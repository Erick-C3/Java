/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Katsuo
 */
class Cuadrado extends FiguraGeometrica{

    private double lado = 5; // double es similar a un float
    
    
    Cuadrado(){
        nombre = "cuadrado";
    }
    
    /**
     * Calcula el area del Cuadrado (lado^2)
     * @return el area del Cuadrado
     */
    @Override
    public double calcularArea() {
        System.out.println("Usando ecuacion de cuadrado");
        //return lado*lado;
        
        return (Math.pow(lado, 2));
    }
    
    public void comportamientoDeCuadrado(){
        System.out.println("Comportamiento propio de cuadrado");
    }
    
}
