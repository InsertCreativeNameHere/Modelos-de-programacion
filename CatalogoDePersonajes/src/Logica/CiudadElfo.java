/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ldani
 */
public class CiudadElfo implements Ciudad {

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

    
    
    public CiudadElfo() throws IOException {
        clase = "Elfos";
        descripcion = "HighGarden es una ciudad construida con poderosa magia elfica"
                + ", sus altos edificios dorados son simbolos de la magia de luz de los"
                + " elfos que la habitan, su principal fuente de comercio son los hechizos,"
                + " pociones y encantamientos. ";
        img = ImageIO.read(new File("img/Ciudades/HighGarden.png"));
    }

}
