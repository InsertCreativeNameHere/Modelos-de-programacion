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
public class CuerpoDoomSlayer implements Cuerpo {

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
    
    

    public CuerpoDoomSlayer() {
        clase = "DoomSlayers";
        descripcion = "Los DoomSlayer miden entre 2.20m y 2.35m, son de constitucion extremadamente"
                + " fuerte y resistente, la mayoria de ellos llevan uno de sus brazos con intensas quemaduras"
                + ", esto como simbolo de su poder.";
        img = new ImageIcon("img/Cuerpos/DoomSlayer.png");
        sprite = new ImageIcon("Sprites/DoomSlayers/DLL.gif");
        vida = 300;
    }
    
}
