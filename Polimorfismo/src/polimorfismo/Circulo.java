/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

import static java.lang.Math.PI;

/**
 *
 * @author Katsuo
 */
class Circulo extends FiguraGeometrica {

    private double radio = 1.4;

    public Circulo() {
        
        nombre = "Circulo";
    }

    
    
    
    /**
     * calcula el area del Circulo (PI * (r)^2)
     * @return el area del Circulo
     */
    @Override
    public double calcularArea() {
        System.out.println("Usando ecuacion de circulo");
        return PI * Math.pow(radio, 2);
    }
    
}
