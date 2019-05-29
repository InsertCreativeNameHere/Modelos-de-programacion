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
public class Composite implements Figura{

    Figura[] a;

    public Composite(int cantidad) {
       int c = 0;
       a = new Figura[cantidad];
       Figura circulo1 = new Circulo(100,false);
       a[c] = circulo1;
       c++;
       for (int i = 0; i < 2; i++) {
           agregarParte(c, 50, false);
            c = c+1;
        }
        for (int i = 0; i < 5; i++) {
            agregarParte(c, 25, false);
            c = c+1;
        }
        for (int i = 0; i < 3; i++) {
            agregarParte(c, 10, true);
            c = c+1;
        }
        
    }
   
    
    
    
    @Override
    public void Dibujar(Graphics2D lapiz, int x, int y) {
        a[0].Dibujar(lapiz, x, y);
        a[1].Dibujar(lapiz, x-50, y-50);
        a[2].Dibujar(lapiz, x+150, y-50);
        a[3].Dibujar(lapiz, x, y-14);
        a[4].Dibujar(lapiz, x+150, y-14);
        a[5].Dibujar(lapiz, x+50, y+50);
        a[6].Dibujar(lapiz, x+100, y+50);
        a[7].Dibujar(lapiz, x+75, y+90);
        a[8].Dibujar(lapiz, x+105, y+75);
        a[9].Dibujar(lapiz, x+85, y+110);
        a[10].Dibujar(lapiz, x+75, y+75);
    }
    
    public void agregarParte(int p,int r, boolean estado){
        a[p] = new Circulo(r, estado);
    }
    
}
