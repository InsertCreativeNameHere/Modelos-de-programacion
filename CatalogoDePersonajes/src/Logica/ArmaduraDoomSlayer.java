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
public class ArmaduraDoomSlayer implements Armadura {

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

    public ArmaduraDoomSlayer() {
        this.clase = "DoomSlayers";
        this.descripcion = "Los DoomSlayers utilizan armaduras hechas con aleaciones "
                + " de acero pesado, aunque esto no les detiene de moverse con agilidad.";
        img = new ImageIcon("img/Armaduras/ArmaduraDoomSlayer.png");
    }
}
