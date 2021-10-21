/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciajava;

/**
 *
 * @author Katsuo
 */
public class Perro extends Mascota{
    
    
    @Override //sobreescribir
    public void comer(){
        System.out.println("Perro esta comiendo");
    }
    
    @Override //sobreescribir
    public void hacerRuido(){
        System.out.println("Woff!");
    } 
}
