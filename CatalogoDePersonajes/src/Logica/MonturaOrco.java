
package Logica;

import javax.swing.ImageIcon;


public class MonturaOrco implements Montura {

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
    
    

    public MonturaOrco() {
        clase = "Orcos";
        descripcion = "La montura principal de los orcos son los rinocerontes de guerra";
        //img = new ImageIcon(<inserte la ruta de la imagen>);
    }
}
