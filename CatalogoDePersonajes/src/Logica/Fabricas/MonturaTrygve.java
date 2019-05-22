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
public class MonturaTrygve implements Montura {

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
    
    

    public MonturaTrygve() {
        clase = "Trygves";
        descripcion = "Los Trygve no utilizan montura ya que pueden volar";
        img = new ImageIcon("img/Monturas/MonturaTrygve.png");
        velocidad = 100;
    }
}
