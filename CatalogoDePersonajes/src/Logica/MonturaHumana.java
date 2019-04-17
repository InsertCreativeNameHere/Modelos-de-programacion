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
public class MonturaHumana implements Montura{

    private String clase; 
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public MonturaHumana() {
        this.clase = "Humanos";
        this.descripcion = "Los humanos utilizan como transporte principal animales del genero equino";
    }

    
   
    
}
