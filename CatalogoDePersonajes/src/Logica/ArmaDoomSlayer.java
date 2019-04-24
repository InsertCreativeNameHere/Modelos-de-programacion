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
public class ArmaDoomSlayer implements Arma {

     private String clase;
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArmaDoomSlayer() {
        this.clase = "DoomSlayers";
        this.descripcion = "El arma principal de los DoomSlayer es el cañon de Gauss, un tipo de cañon "
                + "que utiliza un acelerador de energia infernal para disparar proyectiles a grandes velocidades.";
                
    }
}
