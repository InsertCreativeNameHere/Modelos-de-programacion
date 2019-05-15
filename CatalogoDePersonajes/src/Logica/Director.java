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
public class Director {
    
    private Constructor esclavito;

    public Director(Constructor esclavo) {
        this.esclavito = esclavo;
    }
    
    public void construirPersonaje(){
        this.esclavito.crearInstancia();
        this.esclavito.crearArma();
        this.esclavito.crearArmadura();
        this.esclavito.crearCuerpo();
        this.esclavito.crearMontura();
    }
    
    public PersonajeNativo obtenerPersonaje(){
        return this.esclavito.getInstancia();
    }
    
}
