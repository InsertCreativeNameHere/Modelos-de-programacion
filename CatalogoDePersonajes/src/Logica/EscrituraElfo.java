/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Font;

/**
 *
 * @author javie
 */
public class EscrituraElfo implements Escritura{
    Font idioma;

    public Font getIdioma() {
        return idioma;
    }

    public EscrituraElfo() {
        idioma = new Font("EnglishTowne", 0, 15);
    }
}
