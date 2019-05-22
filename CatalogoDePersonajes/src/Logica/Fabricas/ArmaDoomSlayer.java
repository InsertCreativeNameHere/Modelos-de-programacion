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
public class ArmaDoomSlayer implements Arma {

    private String clase;
    private String descripcion;
    private ImageIcon img;
    private ImageIcon sprite;
    private int daño;

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

    public int getDaño() {
        return daño;
    }
    
    

    public ArmaDoomSlayer() {
        this.descripcion = "El arma principal de los DoomSlayer es el cañon de Gauss, un tipo de cañon "
                + "que utiliza un acelerador de energia infernal para disparar proyectiles a grandes velocidades.";                
        img = new ImageIcon("img/Armas/ArmaDoomSlayer.png");
        sprite = new ImageIcon("Sprites/DoomSlayers/DC.gif");
        daño = 100;
    }
}
