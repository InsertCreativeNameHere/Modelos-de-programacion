/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author ldani
 */
public class CiudadHumana implements Ciudad{

    private String clase; 
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public CiudadHumana() {
        this.clase = "Humanos";
        this.descripcion = "Meridian, una ciudad construida hace siglos debido a"
                + " la necesidad de los humanos de defenderse de las amenazas ce"
                + "rcanas. Sus altos muros y castillos de piedra resultan imponentes"
                + "para quienes los contemplan, esta construida sobre una gran planicie  "
                + ", esto permite que la agricultura y el ganado sean una de sus mas poderosas"
                + "fuentes de comercio.";       
    }
    
    
    
    
    
    
}
