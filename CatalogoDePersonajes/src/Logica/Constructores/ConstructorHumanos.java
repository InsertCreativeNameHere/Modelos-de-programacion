/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Constructores;

import Logica.Fabricas.FabricaAbstracta;
import Logica.Fabricas.FabricaHumano;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author ldani
 */
public class ConstructorHumanos extends Constructor{

    private FabricaAbstracta miFabrica;

    public ConstructorHumanos() throws UnsupportedAudioFileException, LineUnavailableException {
        this.miFabrica = new FabricaHumano();
    }
    
    
    public void crearCuerpo() {
        
        this.instancia.setMiCuerpo(miFabrica.getMiCuerpo());
        System.out.println("cree un cuerpo");
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
        instancia = new PersonajeNativo(1500);
    }
}
