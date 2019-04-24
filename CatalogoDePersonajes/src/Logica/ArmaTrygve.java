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
public class ArmaTrygve implements Arma {

    private String clase;
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArmaTrygve() {
        this.clase = "Trygves";
        this.descripcion = "Los Trygve no utilizan armas, ya que su propio cuerpo es una, pueden lanzar"
                + " rayos de energia elemental o crear armas de esta misma";
    }
}
