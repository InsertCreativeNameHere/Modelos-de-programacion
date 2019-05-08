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
public class ArmaduraOrco implements Armadura {

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
    
    

    public ArmaduraOrco() {
        this.clase = "Orcos";
        this.descripcion = "Los orcos confian en su propia resistencia, por ello no suelen utilizar armaduras"
                + " muy reforzadas, pero si lo hacen, utilizan armaduras de cota de malla.";
        img = new ImageIcon("img/Armaduras/ArmaduraOrco.png");
        sprite = new ImageIcon("direccion aqui");
    }
}
