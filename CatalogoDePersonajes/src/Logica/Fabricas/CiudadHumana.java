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
public class CiudadHumana implements Ciudad{

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
    
    

    public CiudadHumana() throws IOException {
        clase = "Humanos";
        descripcion = "Meridian, una ciudad construida hace siglos debido a"
                + " la necesidad de los humanos de defenderse de las amenazas ce"
                + "rcanas. Sus altos muros y castillos de piedra resultan imponentes"
                + " para quienes los contemplan, esta construida sobre una gran planicie  "
                + ", esto permite que la agricultura y el ganado sean una de sus mas poderosas"
                + " fuentes de comercio.";  
       img = ImageIO.read(new File("img/Ciudades/Meridian.png"));
    }

    
}
