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
public class ArmaduraTrygve implements Armadura {

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

    public ArmaduraTrygve() {
        this.clase = "Trygves";
        this.descripcion = "Los Trygve no utilizan armadura";
        img = new ImageIcon("img/Armaduras/ArmaduraTrygve.png");        
    }
}
