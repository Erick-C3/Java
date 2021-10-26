/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author Katsuo
 */
public class Polimorfismo {
    
    /*
        - Polimorfismo 
            - figuras geometricas
            - perro gato mascota
    
    
    
        1* podria decir que una moto ES UN vehiculo? sebastian - paula
        2* podria decir que un choche ES UN vehiculo? sebastian - paula
    
        3* podria decir que un vehiculo ES UNA moto ? duda
        4* podria decir que un vehiculo ES UN coche ? duda
    
    
        5* podria decir que una persona ES erick ? no tiene sentido en programacion
    
        6* podria decir que erick ES UNA persona ? si
    
        7* podria decir que un cuadrado ES UNA figura geomtrica? tiene sentido
        7* podria decir que un triangulo ES UNA figura geomtrica? tiene sentido
        7* podria decir que un circulo ES UNA figura geomtrica? tiene sentido
        
        8* podria decir que una figura geometrica ES UN cuadrado ? no tiene sentido
        9* puedo  decir que una figura geometrica ES UN triangulo -
        10* puedo  decir que una figura geometrica ES UN circulo -        
        
    */
    
    
    
    /*
        Ejemplo de POLIMORFISMO con FIGURAS GEOMETRICAS
            X (forma no tan viable, usar solo los atributos) (mas cercano al paradigma estructurado)
            - inicial sin polimorfismo (aun asi aplicamos POO)
            - con polimorfismo
    
    
    problema: 
        calcular el area de:
            - cuadrado
            - circulo
            - triangulo
    
            
    */
    
    /**
     * Muestra el area de una figura geomtrica
     * 
     * @param unaFigura un objeto que hereda  de la clase FiguraGeometrica
     */
    public static void mostrarArea(FiguraGeometrica unaFigura){        
        System.out.println("Area : " + unaFigura.calcularArea() + unaFigura.getUnidad());
        
    }
    
    public static void setearUnidadesFiguras(FiguraGeometrica unaFigura){
        Scanner unidadEscaner = new Scanner(System.in);//podria ser un atributo de la clase
        System.out.println("Ingrese unidad del " + unaFigura.getNombre());
        String unidadRecibida = unidadEscaner.nextLine();
        unaFigura.setUnidad(unidadRecibida);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiguraGeometrica unaFiguraGeometrica = new FiguraGeometrica();
        Cuadrado unCuadrado = new Cuadrado();
        Circulo unCirculo = new Circulo();
        Triangulo unTriangulo = new Triangulo();// no seria lo ideal
        
        setearUnidadesFiguras(unCuadrado);
        setearUnidadesFiguras(unCirculo);
        setearUnidadesFiguras(unTriangulo);
        
        
        mostrarArea(unCuadrado);
        mostrarArea(unCirculo);
        mostrarArea(unTriangulo);
        
        
        /**
         * 1º Pensar en objetos y crear clases 
         * 2º Pensar en objetos que se relacionen de alguna manera(Ejemplo una mascota)
         * 3º Luego de usar herencia entonces aplicar el polimorfismo
         */
        
    }
    
}
