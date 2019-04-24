/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author javie
 */
public class MusicaElfo implements Musica{
    
    Clip musica;

    public Clip getMusica() {
        return musica;
    }
    
    
    public MusicaElfo() throws UnsupportedAudioFileException, LineUnavailableException {
        musica = AudioSystem.getClip();
        try {
            musica.open(AudioSystem.getAudioInputStream(new File("Musica/Elfos.wav")));
        } catch (IOException ex) {
            Logger.getLogger(MusicaHumana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    
}
