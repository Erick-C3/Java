/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author Katsuo
 */
class FiguraGeometrica {
    
    private static final double AREA_DEF = -1;
    private String unidad ="unidad def";
    protected String nombre;
    
    
    
    //extra
    //constructor para inicializar el atributo unidad
    
    /**
     * Calcula el area de la FiguraGeometrica
     * @return el area de la FiguraGeometrica
     */
    public double calcularArea(){
        return AREA_DEF;
    }
    
    public String getUnidad(){
        return unidad;
    }
    
    public void setUnidad(String unidad){
        this.unidad = unidad;
    }

    String getNombre() {
        return nombre;
    }
}
