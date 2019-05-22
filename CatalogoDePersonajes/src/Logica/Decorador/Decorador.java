/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Decorador;

import Logica.Constructores.Personaje;
import java.awt.image.BufferedImage;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

/**
 *
 * @author javie
 */
public abstract class Decorador implements Personaje {

   private Personaje miInstancia;
   
   public Decorador(Personaje p){
       System.out.println("cree una instancia");
       this.miInstancia = p;
   }

    public Personaje getMiInstancia() {
        return miInstancia;
    }

    public void setMiInstancia(Personaje miInstancia) {
        this.miInstancia = miInstancia;
    }
   
   
    
}
