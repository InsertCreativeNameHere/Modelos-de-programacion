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
public class ArmaOrco implements Arma {

    private String clase;
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArmaOrco() {
        this.clase = "Orcos";
        this.descripcion = "La principal arma de los orcos son los garrotes de madera, en su mayoria"
                + " con puas de acero, aunque esto no les detiene de utilizar armas como hachas de"
                + " guerra a dos manos.";
    }

}
