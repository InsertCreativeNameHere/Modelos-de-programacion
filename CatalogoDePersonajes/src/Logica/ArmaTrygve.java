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
public class ArmaTrygve implements Arma {

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

    public ArmaTrygve() {
        this.clase = "Trygves";
        this.descripcion = "Los Trygve no utilizan armas, ya que su propio cuerpo es una, pueden lanzar"
                + " rayos de energia elemental o crear armas de esta misma";
        img = new ImageIcon("img/Armas/ArmaTrygve.png");
    }
}
