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
public class MonturaElfo implements Montura {

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
    

    public MonturaElfo() {
        clase = "Elfos";
        descripcion = "La montura principal de los elfos son los leopardos de las nieves, los cuales"
                + " refuerzan con armaduras magicas.";
        //img = new ImageIcon(<inserte la ruta de la imagen>);
    }
}
