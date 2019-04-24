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
public class ArmaduraOrco implements Armadura {

    private String clase;
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArmaduraOrco() {
        this.clase = "Orcos";
        this.descripcion = "Los orcos confian en su propia resistencia, por ello no suelen utilizar armaduras"
                + " muy reforzadas, pero si lo hacen, utilizan armaduras de cota de malla.";
    }
}
