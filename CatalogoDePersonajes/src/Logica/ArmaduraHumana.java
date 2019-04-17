/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author ldani
 */
public class ArmaduraHumana implements Armadura {

   private String clase; 
    private String descripcion;

    public String getClase() {
        return clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArmaduraHumana() {
        this.clase = "Humanos";
        this.descripcion = "Los humanos utilizan ligeras armaduras principalmente hechas de tela y aleaciones de metal";
    }
    
    
}
