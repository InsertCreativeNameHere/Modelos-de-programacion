/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.ImageIcon;

/**
 *
 * @author ldani
 */
public class ArmaduraElfo implements Armadura {

    private String clase;
    private String descripcion;
    private ImageIcon img;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ImageIcon getImg() {

        return img;
    }

    public ArmaduraElfo() {
        this.clase = "Elfos";
        this.descripcion = "Los elfos utilizan armaduras de cuero.";
        img = new ImageIcon("img/Armaduras/ArmaduraElfo.png");
    }
}
