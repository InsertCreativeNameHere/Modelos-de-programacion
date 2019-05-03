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
public class CiudadTrygve implements Ciudad {

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
    
    

    public CiudadTrygve() throws IOException {
        clase = "Trygves";
        descripcion = "Etheria es un pilar gigante de magia elemental, ya que los"
                + " Trygve no necesitan de edificaciones, aunque si la utilizan como una fuente de"
                + " energia (o alimento).";
        img = ImageIO.read(new File("img/Ciudades/Etheria.png"));
    }

}
