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
public class CiudadOrco implements Ciudad {

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
      

    public CiudadOrco() throws IOException {
        clase = "Orcos";
        descripcion = "Rudania es una ciudad a simple vista primitiva, pero"
                + " a la hora de la batalla, una ciudad imponente y poderosa, construida"
                + " en un ambiente de constante guerra, y habitada por un enorme ejercito"
                + " de salvajes guerreros Orcos, su principal fuente de comercio es la"
                + " contratación de mercenarios.";   
        img = ImageIO.read(new File("img/Rudania.png"));
    }

 
}
