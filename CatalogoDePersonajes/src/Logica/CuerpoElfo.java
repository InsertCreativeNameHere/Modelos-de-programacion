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
public class CuerpoElfo implements Cuerpo {

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

    public CuerpoElfo() {
        clase = "Elfos";
        descripcion = "Los elfos miden entre 1,75m y 1.90m y pesan entre 50kg y 60kg, son de constitucion "
                + " delgada y de fino semblante, desde que nacen tienen gran afinidad con la magia"
                + " y los hechizos.";
        img = new ImageIcon("img/Cuerpos/Elfo.png");
    }
}
