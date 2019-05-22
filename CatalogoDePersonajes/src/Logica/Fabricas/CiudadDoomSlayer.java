/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Fabricas;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ldani
 */
public class CiudadDoomSlayer implements Ciudad {

    private String clase;
    private String descripcion;
    private BufferedImage img;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public BufferedImage getImg() {
        return img;
    }

    public CiudadDoomSlayer() throws IOException {
        this.clase = "DoomSlayers";
        this.descripcion = "La ciudad de los DoomSlayer es el mausoleo, una gigantezca cripta "
                + " rodeada de poderosas y peligrosas bestias, la muerte es tan solo una mas"
                + " de las caracteristicas de este lugar.";
        this.img = ImageIO.read(new File("img/Ciudades/Mausoleo.png"));
    }



    
}
