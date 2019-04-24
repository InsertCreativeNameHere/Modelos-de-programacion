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
public class ArmaduraTrygve implements Armadura {

   private String clase;
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArmaduraTrygve() {
        this.clase = "Trygves";
        this.descripcion = "Los Trygve no utilizan armadura";
    }
}
