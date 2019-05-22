/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Fabricas;

import javax.swing.ImageIcon;

/**
 *
 * @author ldani
 */
public class ArmaduraElfo implements Armadura {

    private String clase;
    private String descripcion;
    private ImageIcon img;
    private ImageIcon sprite;
    private int armadura;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ImageIcon getImg() {

        return img;
    }

    public ImageIcon getSprite() {
        return sprite;
    }

    public int getArmadura() {
        return armadura;
    }

    public ArmaduraElfo() {
        this.clase = "Elfos";
        this.descripcion = "Los elfos utilizan armaduras de cuero.";
        img = new ImageIcon("img/Armaduras/ArmaduraElfo.png");
        sprite = new ImageIcon("direccion aqui");
        armadura = 15;
    }
}
