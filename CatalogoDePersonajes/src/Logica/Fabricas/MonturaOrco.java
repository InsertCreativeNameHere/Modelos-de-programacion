
package Logica.Fabricas;

import javax.swing.ImageIcon;


public class MonturaOrco implements Montura {

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
    
    

    public MonturaOrco() {
        clase = "Orcos";
        descripcion = "La montura principal de los orcos son los rinocerontes de guerra";
        img = new ImageIcon("img/Monturas/MonturaOrco.png");
        velocidad = 35;
    }
}
