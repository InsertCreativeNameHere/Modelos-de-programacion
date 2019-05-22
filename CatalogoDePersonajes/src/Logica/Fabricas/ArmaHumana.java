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
public class ArmaHumana implements Arma {
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
    
    

    public ArmaHumana() {
        this.clase = "Humanos";
        this.descripcion = "Los humanos utilizan katanas y arcos"
                + ". Las katanas están hechas de colmillo de revenant (lobo salvaje de pradera) ";
        img = new ImageIcon("img/Armas/ArmaHumano.png");
        sprite = new ImageIcon("Sprites/Humanos/HC.gif");
        daño = 55;
    }

    
    
}
