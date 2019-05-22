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
public class MonturaElfo implements Montura {

    private String clase; 
    private String descripcion;
    private ImageIcon img;
    private int velocidad;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ImageIcon getImg() {
        return img;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    

    public MonturaElfo() {
        clase = "Elfos";
        descripcion = "La montura principal de los elfos son los leopardos de las nieves, los cuales"
                + " refuerzan con armaduras magicas.";
        img = new ImageIcon("img/Monturas/MonturaElfo.png");
        velocidad = 65;
    }
}
