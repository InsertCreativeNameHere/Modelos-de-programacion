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
public class FabricaHumano implements FabricaAbstracta{

    private Ciudad miCiudad;
    private Cuerpo miCuerpo;
    private Arma miArma;
    private Montura miMontura;
    private Armadura miArmadura;
    private Musica miMusica;
    private Escritura miEscritura;
    
    public void crearCiudad() {
        try {
            miCiudad = new CiudadHumana();
        } catch (IOException ex) {
            Logger.getLogger(FabricaHumano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void crearCuerpo() {
        miCuerpo = new CuerpoHumano();
    }

  
    public void crearArma() {
        miArma = new ArmaHumana();
    }

    
    public void crearMontura() {
        miMontura = new MonturaHumana();
    }

   
    public void crearArmadura() {
        miArmadura = new ArmaduraHumana();
    }
    
    public void crearMusica() throws UnsupportedAudioFileException, LineUnavailableException{
        miMusica = new MusicaHumana();
    }
    
    public void crearEscritura(){
        miEscritura = new EscrituraHumana();
    }

    public FabricaHumano() throws UnsupportedAudioFileException, LineUnavailableException {
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

    public Musica getMiMusica() {
        return miMusica;
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

    public Escritura getMiEscritura() {
        return miEscritura;
    }

    
}
