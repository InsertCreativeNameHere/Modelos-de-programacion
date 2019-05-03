/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.ImageIcon;

public class CuerpoHumano implements Cuerpo{
    
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
    
    

    public CuerpoHumano() {
        clase = "Humanos";
        descripcion = "Los humanos miden entre  1.60m y 1.70m aproximadamente"
                + ", y pesan  entre 60kg y 70 kg, son de constitucion delgada, lo que "
                + "les permite gran agilidad en batalla ";
        img = new ImageIcon("img/Cuerpos/Humano.png");
    }
    
    
    
}
