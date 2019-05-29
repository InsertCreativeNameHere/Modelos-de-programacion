/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujaroso;

import com.sun.prism.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author estudiantes
 */
public interface Figura {
    
    public abstract void Dibujar(Graphics2D lapiz,int x, int y);
    
}
