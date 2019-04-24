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
public class MonturaTrygve implements Montura {

    private String clase;
    private String descripcion;
    private ImageIcon img;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ImageIcon getImg() {
        return img;
    }
    
    

    public MonturaTrygve() {
        clase = "Trygves";
        descripcion = "Los Trygve no utilizan montura ya que pueden volar";
        //img = new ImageIcon(<inserte la ruta de la imagen>);
    }
}
