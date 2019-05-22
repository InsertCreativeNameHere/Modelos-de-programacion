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
public class CuerpoTrygve implements Cuerpo {

    private String clase;
    private String descripcion;
    private ImageIcon img;
    private ImageIcon sprite;
    private int vida;

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

    public int getVida() {
        return vida;
    }
    
    

    public CuerpoTrygve() {
        clase = "Trygves";
        descripcion ="Los Trygve son seres elementales con forma humanoide, miden entre 1.40m y 1.50m"
                + " y su cuerpo es energia pura";
        img = new ImageIcon("img/Cuerpos/Trygve.png");
        sprite = new ImageIcon("Sprites/Trygves/Standby.gif");
        vida = 150;
    }
    
}
