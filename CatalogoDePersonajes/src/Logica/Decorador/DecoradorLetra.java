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
public class DecoradorLetra extends Decorador{

    public DecoradorLetra(Personaje p) {
        super(p);    
    }

    @Override
    public void Atacar() {
        getMiInstancia().Atacar();
    }

    @Override
    public String getMiArmaDesc() {
        return getMiInstancia().getMiArmaDesc();
    }

    @Override
    public String getMiArmaduraDesc() {
        return getMiInstancia().getMiArmaduraDesc();
    }

    @Override
    public String getMiMonturaDesc() {
        return getMiInstancia().getMiMonturaDesc();
    }

    @Override
    public String getMiCuerpoDesc() {
        return getMiInstancia().getMiCuerpoDesc();
    }

    @Override
    public String getMiCiudadDesc() {
       return getMiInstancia().getMiCiudadDesc();
    }

    @Override
    public ImageIcon getmiArmaduraImg() {
        return getMiInstancia().getmiArmaduraImg();
    }

    @Override
    public ImageIcon getmiArmaImg() {
        return getMiInstancia().getmiArmaImg();
    }

    @Override
    public ImageIcon getmiMonturaImg() {
       return getMiInstancia().getmiMonturaImg();
    }

    @Override
    public ImageIcon getmiCuerpoImg() {
        return getMiInstancia().getmiCuerpoImg();
    }

    @Override
    public BufferedImage getmiCiudadImg() {
        return getMiInstancia().getmiCiudadImg();
    }

    @Override
    public Clip getmiMusica() {
        return getMiInstancia().getmiMusica();
    }

    @Override
    public int getmiDaño() {
        return getMiInstancia().getmiDaño() + 100;
    }

    @Override
    public int getmiArmadura() {
        return getMiInstancia().getmiArmadura() - 50;
    }

    @Override
    public int getmiVida() {
        return getMiInstancia().getmiVida();
    }

    @Override
    public int getmiVelocidad() {
        return getMiInstancia().getmiVelocidad() + 25;
    }

    
    
}
