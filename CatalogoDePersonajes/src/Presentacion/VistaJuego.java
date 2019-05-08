
package Presentacion;

import Logica.Personaje;
import com.sun.java.swing.plaf.motif.MotifTreeCellRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.Timer;


public class VistaJuego extends javax.swing.JFrame implements Runnable{

    
    Personaje miPersonaje;
    int contador;
    Thread hilo;
    
    public VistaJuego(Personaje perso) {
       
        initComponents();
        miPersonaje = perso;
        miPersonaje.setSpriteActivo(miPersonaje.getMiCuerpo().getSprite());
        this.setLocationRelativeTo(null);
        int mitadh = (int) (this.getSize().height/2);
        lblPersonaje2.setText("");
        lblPersonaje2.setLocation(mitadh, 10);
        lblPersonaje2.setSize(200, 200);
        lblPersonaje2.setIcon(miPersonaje.getMiCuerpo().getSprite());        
    }
    
    public void cambiarSprite(){
        while(true){
            System.out.println("while");
            if(miPersonaje.getEstado() == "quieto"){
                System.out.println("me rompi");
                break;
            }
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        btnAtacar = new javax.swing.JButton();
        lblPersonaje2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAtacar.setText("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblPersonaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAtacar))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnVolver))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPersonaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnAtacar)))
                .addGap(56, 56, 56)
                .addComponent(btnVolver))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed

        miPersonaje.Atacar();
        lblPersonaje2.setIcon(miPersonaje.getSpriteActivo());
        hilo = new Thread(this, "hilo");
        hilo.start();
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        try {
            VistaMenu v = new VistaMenu();
            v.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblPersonaje2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
         cambiarSprite();
         lblPersonaje2.setIcon(miPersonaje.getSpriteActivo());
    }


    
}
