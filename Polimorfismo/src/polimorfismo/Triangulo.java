/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Katsuo
 */
public class Triangulo extends FiguraGeometrica {

    private float base = 2;
    private float altura = 2.3F;

    public Triangulo() {
        nombre = "Triangulo";
    }
    
    /**
     * Calula el area del Triangulo
     * @return el area del Triangulo
     */
    @Override
    public double calcularArea(){
        System.out.println("Usando ecucacion de triangulo");
        return (base * altura /2);
    }
    
}
