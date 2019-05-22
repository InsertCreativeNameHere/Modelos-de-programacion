/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Constructores;

import java.awt.image.BufferedImage;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

/**
 *
 * @author ldani
 */
public interface Personaje {
    
    
    
    public abstract void Atacar();
    public abstract String getMiArmaDesc();
    public abstract String getMiArmaduraDesc();
    public abstract String getMiMonturaDesc();
    public abstract String getMiCuerpoDesc();
    public abstract String getMiCiudadDesc();
    public abstract ImageIcon getmiArmaduraImg();
    public abstract ImageIcon getmiArmaImg();
    public abstract ImageIcon getmiMonturaImg();
    public abstract ImageIcon getmiCuerpoImg();
    public abstract BufferedImage getmiCiudadImg();
    public abstract Clip getmiMusica();
    public abstract int getmiDaño();
    public abstract int getmiArmadura();
    public abstract int getmiVida();
    public abstract int getmiVelocidad();
}
