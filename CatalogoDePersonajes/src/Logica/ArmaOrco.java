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
public class ArmaOrco implements Arma {

    private String clase;
    private String descripcion;
    private ImageIcon img;
    private ImageIcon sprite;
    
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
    
    

    public ArmaOrco() {
        this.clase = "Orcos";
        this.descripcion = "La principal arma de los orcos son los garrotes de madera, en su mayoria"
                + " con puas de acero, aunque esto no les detiene de utilizar armas como hachas de"
                + " guerra a dos manos.";
        img = new ImageIcon("img/Armas/ArmaOrco.png");
        sprite = new ImageIcon("Sprites/Orcos/OC.gif");
    }

}
