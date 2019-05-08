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
public class CuerpoOrco implements Cuerpo {

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
    
    
    
    public CuerpoOrco() {
        clase = "Orcos";
        descripcion = "Los orcos son de constitucion fuerte, su piel dura les"
                + " ofrece una enorme resistencia al daño fisico, miden entre 2.25m y 2.40m"
                + " y pesan entre 100kg y 125kg aproximadamente.";
        img = new ImageIcon("img/Cuerpos/Orco.png");
        sprite = new ImageIcon("Sprites/Orcos/OLL.gif");
    }
}
