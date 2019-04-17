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
public class ArmaHumana implements Arma {
    private String clase; 
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArmaHumana() {
        this.clase = "Humanos";
        this.descripcion = "Los humanos utilizan katanas y arcos"
                + ". Las katanas están hechas de colmillo de revenant (lobo salvaje de pradera) ";
    }

    
    
}
