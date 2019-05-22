/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Constructores;

import Logica.Constructores.Personaje;
import Logica.Fabricas.Ciudad;
import Logica.Fabricas.Musica;
import Logica.Fabricas.Arma;
import Logica.Fabricas.Montura;
import Logica.Fabricas.Cuerpo;
import Logica.Fabricas.Armadura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 * Clase de PersonajeNativo
 *
 * @author Javier Apónte, Daniel Hormiga, Leonardo Betancur
 */
public class PersonajeNativo implements ActionListener, Personaje {

    //ATRIBUTOS
    private Cuerpo miCuerpo;
    private Arma miArma;
    private Armadura miArmadura;
    private Montura miMontura;
    private Ciudad miCiudad;
    private Musica miMusica;
    private ImageIcon spriteActivo;
    private Timer tiempo;
    private String estado;

    /**
     * Metodo constructor que inicializa el tiempo del estado del sprite
     *
     * @param t tiempo que tarda la reproduccion del sprite
     */
    public PersonajeNativo(int t) {
        tiempo = new Timer(t, this);
        estado = "quieto";
    }

    /**
     * Metodo para que el sprite del personaje cambie a ataque y vuelva a su
     * estado original
     */
    public void Atacar() {
        tiempo.start();
        spriteActivo = miArma.getSprite();
        estado = "atacando";
    }

    /**
     * Metodo para que el sprite del personaje cambie a llorar y vuelva a su
     * estado original (aun no se ha implementado)
     */
    public void Llorar() {
        //Metodo pendiente
    }

    /**
     * Get del cuerpo
     *
     * @return regresa un objeto del tipo Cuerpo
     */
    public Cuerpo getMiCuerpo() {
        return miCuerpo;
    }

    /**
     * Metodo que establece el cuerpo del personaje
     * @param miCuerpo objeto de clase Cuerpo
     */
    public void setMiCuerpo(Cuerpo miCuerpo) {
        this.miCuerpo = miCuerpo;
    }

    /**
     * Get del arma
     *
     * @return regresa un objeto del tipo Arma
     */
    public Arma getMiArma() {
        return miArma;
    }

    /**
     * Metodo que establece el arma del personaje
     * @param miArma objeto de clase Arma
     */
    public void setMiArma(Arma miArma) {
        this.miArma = miArma;
    }

    /**
     * Get de la Armadura
     *
     * @return regresa un objeto del tipo Armadura
     */
    public Armadura getMiArmadura() {
        return miArmadura;
    }

    /**
     * Metodo que establece la armadura del personaje
     * @param miArmadura objeto de clase Armadura
     */
    public void setMiArmadura(Armadura miArmadura) {
        this.miArmadura = miArmadura;
    }

    /**
     * Get de la Montura
     *
     * @return regresa un objeto del tipo Montura
     */
    public Montura getMiMontura() {
        return miMontura;
    }

    /**
     * Metodo que establece la montura del personaje
     * @param miMontura objeto de clase Montura
     */
    public void setMiMontura(Montura miMontura) {
        this.miMontura = miMontura;
    }

    /**
     * Get del sprite que esta en pantalla
     *
     * @return regresa un ImageIcon
     */
    public ImageIcon getSpriteActivo() {
        return spriteActivo;
    }

    /**
     * Metodo que establece el sprite para mostrar en pantalla
     * @param spriteActivo el ImageIcon que se quiera poner como sprite activo
     */
    public void setSpriteActivo(ImageIcon spriteActivo) {
        this.spriteActivo = spriteActivo;
    }

    /**
     * Metodo para obtener el estado del sprite
     *
     * @return String estado
     */
    public String getEstado() {
        return estado;
    }

    public Ciudad getMiCiudad() {
        return miCiudad;
    }

    public Musica getMiMusica() {
        return miMusica;
    }

    public void setMiMusica(Musica miMusica) {
        this.miMusica = miMusica;
    }
    
    

    public void setMiCiudad(Ciudad miCiudad) {
        this.miCiudad = miCiudad;
    }
    
    

    /**
     * Metodo escuchador del timer
     *
     * @param e variable que recibe el evento
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(tiempo)) {
            spriteActivo = miCuerpo.getSprite();
            estado = "quieto";
            tiempo.stop();
        }
    }

    @Override
    public String getMiArmaDesc() {
        return this.miArma.getDescripcion();
    }

    @Override
    public String getMiArmaduraDesc() {
        return this.miArmadura.getDescripcion();
    }

    @Override
    public String getMiMonturaDesc() {
       return this.miMontura.getDescripcion();
    }

    @Override
    public String getMiCuerpoDesc() {
        return this.miCuerpo.getDescripcion();
    }

    @Override
    public ImageIcon getmiArmaduraImg() {
        return this.miArmadura.getImg();
    }

    @Override
    public ImageIcon getmiArmaImg() {
        return this.miArma.getImg();
    }

    @Override
    public ImageIcon getmiMonturaImg() {
        return this.miMontura.getImg();
    }

    @Override
    public ImageIcon getmiCuerpoImg() {
        return this.miCuerpo.getImg();
    }

    @Override
    public String getMiCiudadDesc() {
        return this.miCiudad.getDescripcion();
    }

    @Override
    public BufferedImage getmiCiudadImg() {
        return this.miCiudad.getImg();
    }

    @Override
    public Clip getmiMusica() {
        return this.miMusica.getMusica();
    }

    @Override
    public int getmiDaño() {
       return this.miArma.getDaño();
    }

    @Override
    public int getmiArmadura() {
         return this.miArmadura.getArmadura();
    }

    @Override
    public int getmiVida() {
         return this.miCuerpo.getVida();
    }

    @Override
    public int getmiVelocidad() {
        return this.miMontura.getVelocidad();
    }
    
    

}
