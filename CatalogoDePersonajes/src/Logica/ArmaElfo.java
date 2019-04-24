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
public class ArmaElfo implements Arma {

    private String clase;
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArmaElfo() {
        this.clase = "Elfos";
        this.descripcion = "La principal arma de los elfos son los cetros magicos "
                + "y en algunos casos arcos de hilo magico, lo que les permite disparar "
                + "flechas de luz muy efectivas contra la magia oscura ";
    }

}
