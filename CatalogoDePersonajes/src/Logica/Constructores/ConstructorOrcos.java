/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Constructores;

import Logica.Fabricas.FabricaOrco;
import Logica.Fabricas.FabricaAbstracta;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author ldani
 */
public class ConstructorOrcos extends Constructor {
        private FabricaAbstracta miFabrica;

    public ConstructorOrcos() throws UnsupportedAudioFileException, LineUnavailableException {
        this.miFabrica = new FabricaOrco();
    }
    
    
    public void crearCuerpo() {
        
        this.instancia.setMiCuerpo(miFabrica.getMiCuerpo());
    }

    
    public void crearArma() {
        this.instancia.setMiArma(miFabrica.getMiArma());
    }

    
    public void crearArmadura() {
       this.instancia.setMiArmadura(miFabrica.getMiArmadura());
    }

    
    public void crearMontura() {
        this.instancia.setMiMontura(miFabrica.getMiMontura());
    }
    
    public void crearCiudad(){
        this.instancia.setMiCiudad(miFabrica.getMiCiudad());
                
    }
    
    public void crearMusica(){
        this.instancia.setMiMusica(miFabrica.getMiMusica());
    }
    public void crearInstancia() {
        instancia = new PersonajeNativo(2100);
    }
}
