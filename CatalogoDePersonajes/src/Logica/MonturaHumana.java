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
public class MonturaHumana implements Montura{

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


    public MonturaHumana() {
        clase = "Humanos";
        descripcion = "Los humanos utilizan como transporte principal animales del genero equino";
        img = new ImageIcon("img/Monturas/MonturaHumano.png");
    }

    
   
    
}
