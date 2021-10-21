/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciajava;

/**
 *
 * @author Katsuo
 */
public class Gato extends Mascota{
    
    
    @Override //sobreescribir
    public void comer(){
        System.out.println("Gato esta comiendo");
    }
    
    @Override //sobreescribir
    public void hacerRuido(){
        
        System.out.println("Miau♪");
    }  
}
