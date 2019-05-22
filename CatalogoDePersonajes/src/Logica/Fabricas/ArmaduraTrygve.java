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
public class ArmaduraTrygve implements Armadura {

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

    
    
    public ArmaduraTrygve() {
        this.clase = "Trygves";
        this.descripcion = "Los Trygve no utilizan armadura";
        img = new ImageIcon("img/Armaduras/ArmaduraTrygve.png");  
        sprite = new ImageIcon("direccion aqui");
        armadura = 0;
    }
}
