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
public class ArmaduraDoomSlayer implements Armadura {

    private String clase;
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArmaduraDoomSlayer() {
        this.clase = "DoomSlayers";
        this.descripcion = "Los DoomSlayers utilizan armaduras hechas con aleaciones "
                + " de acero pesado, aunque esto no les detiene de moverse con agilidad.";
    }
}
