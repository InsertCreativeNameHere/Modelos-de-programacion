/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author ldani
 */
public class FabricaElfo implements FabricaAbstracta{

    private Ciudad miCiudad;
    private Cuerpo miCuerpo;
    private Arma miArma;
    private Montura miMontura;
    private Armadura miArmadura;
    private Musica miMusica;
    private Escritura miEscritura;

    public void crearCiudad() {
        try {
            miCiudad = new CiudadElfo();
        } catch (IOException ex) {
            Logger.getLogger(FabricaElfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearCuerpo() {
        miCuerpo = new CuerpoElfo();
    }

    public void crearArma() {
        miArma = new ArmaElfo();
    }

    public void crearMontura() {
        miMontura = new MonturaElfo();
    }

    public void crearArmadura() {
        miArmadura = new ArmaduraElfo();
    }
    
    public void crearMusica() throws UnsupportedAudioFileException, LineUnavailableException{
        miMusica = new MusicaElfo();
    }
    
    public void crearEscritura(){
        miEscritura = new EscrituraElfo();
    }

    public FabricaElfo() throws UnsupportedAudioFileException, LineUnavailableException {
        this.crearArma();
        this.crearArmadura();
        this.crearCiudad();
        this.crearCuerpo();
        this.crearMontura();
        this.crearMusica();
        this.crearEscritura();
    }

    public Ciudad getMiCiudad() {
        return miCiudad;
    }

    public Cuerpo getMiCuerpo() {
        return miCuerpo;
    }

    public Arma getMiArma() {
        return miArma;
    }

    public Montura getMiMontura() {
        return miMontura;
    }

    public Armadura getMiArmadura() {
        return miArmadura;
    }

    public Musica getMiMusica() {
        return miMusica;
    }

    public Escritura getMiEscritura() {
        return miEscritura;
    }
    
    
    
}
