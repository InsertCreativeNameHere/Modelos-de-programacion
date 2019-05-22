/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Fabricas;

import java.awt.Font;

/**
 *
 * @author javie
 */
public class EscrituraHumana implements Escritura{
    Font idioma;

    public Font getIdioma() {
        return idioma;
    }

    public EscrituraHumana() {
        idioma = new Font("Enchanted Land", 0, 15);
    }
}
