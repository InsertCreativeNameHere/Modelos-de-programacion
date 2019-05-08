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
public abstract class Constructor {
    
    protected Personaje instancia;
    
    public abstract void crearInstancia();

    public Personaje getInstancia() {
        return instancia;
    }
  
    public abstract void crearCuerpo();
    public abstract void crearArma();
    public abstract void crearArmadura();
    public abstract void crearMontura();
    
}
