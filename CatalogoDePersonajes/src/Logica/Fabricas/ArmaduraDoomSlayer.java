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
public class ArmaduraDoomSlayer implements Armadura {

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
    
    

    public ArmaduraDoomSlayer() {
        this.clase = "DoomSlayers";
        this.descripcion = "Los DoomSlayers utilizan armaduras hechas con aleaciones "
                + " de acero pesado, aunque esto no les detiene de moverse con agilidad.";
        img = new ImageIcon("img/Armaduras/ArmaduraDoomSlayer.png");
        sprite = new ImageIcon("direccion aqui");
        armadura = 85;
    }
}
