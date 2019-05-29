/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujaroso;

import com.sun.prism.Graphics;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author estudiantes
 */
public class Circulo implements Figura{

    private float radio;
    private boolean relleno;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo(int radio, boolean r) {
        this.radio = radio;
        this.relleno = r;
    }
    
    
    
    
    @Override
    public void Dibujar(Graphics2D lapiz, int x, int y) {
        Graphics2D circulo = (Graphics2D) lapiz;
        circulo.setStroke(new BasicStroke(2.f));
        circulo.setPaint(Color.BLACK);
        if(relleno){
            circulo.fillOval(x, y, (int) radio*2, (int) radio*2);
        }else{
            circulo.drawOval(x, y, (int) radio*2, (int) radio*2);
        }
        
    }

}
