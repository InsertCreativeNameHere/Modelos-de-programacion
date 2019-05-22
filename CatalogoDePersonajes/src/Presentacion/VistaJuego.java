package Presentacion;

import Logica.Adaptadores.Adaptador;
import Logica.Constructores.Personaje;
import Logica.Constructores.PersonajeNativo;
import Logica.Decorador.DecoradorLetra;
import com.sun.java.swing.plaf.motif.MotifTreeCellRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class VistaJuego extends javax.swing.JFrame implements Runnable {

    PersonajeNativo miPersonaje;
    Personaje personajeEjemplo;
    int contador;
    Thread hilo;

    public VistaJuego(Personaje perso) {
        initComponents();
        int mitadh = (int) (this.getSize().height / 2);
        this.setLocationRelativeTo(null);
        miPersonaje = new PersonajeNativo(1000);
        if (perso.getClass() == miPersonaje.getClass()) {
            miPersonaje = (PersonajeNativo) perso;
            miPersonaje.setSpriteActivo(miPersonaje.getMiCuerpo().getSprite());
            lblPersonaje2.setText("");
            lblPersonaje2.setLocation(mitadh, 10);
            lblPersonaje2.setSize(200, 200);
            lblPersonaje2.setIcon(miPersonaje.getMiCuerpo().getSprite());
            personajeEjemplo = miPersonaje;
        } else {
            System.out.println("soy diferente :D");
            personajeEjemplo = perso;
        }
        lblDaño.setText(String.valueOf(personajeEjemplo.getmiDaño()));
        lblVida.setText(String.valueOf(personajeEjemplo.getmiVida()));
        lblArmadura.setText(String.valueOf(personajeEjemplo.getmiArmadura()));
        lblVelocidad.setText(String.valueOf(personajeEjemplo.getmiVelocidad())); 
    }

    public void cambiarSprite() {
        while (true) {
            System.out.println("while");
            if (miPersonaje.getEstado() == "quieto") {
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
        lblVida = new javax.swing.JLabel();
        lblDaño = new javax.swing.JLabel();
        lblArmadura = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAddDecorador = new javax.swing.JButton();

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

        lblVida.setText("Vida");

        lblDaño.setText("Daño");

        lblArmadura.setText("Armadura");

        lblVelocidad.setText("Velocidad");

        jLabel1.setText("Vida:");

        jLabel2.setText("Daño:");

        jLabel3.setText("Armadura:");

        jLabel4.setText("Velocidad: ");

        btnAddDecorador.setText("Agregar decorador");
        btnAddDecorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDecoradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblPersonaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnVolver)))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtacar)
                    .addComponent(btnAddDecorador))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVelocidad)
                    .addComponent(lblArmadura)
                    .addComponent(lblDaño)
                    .addComponent(lblVida))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPersonaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVida)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDaño)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArmadura)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVelocidad)
                            .addComponent(jLabel4)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnAtacar)
                .addGap(16, 16, 16)
                .addComponent(btnAddDecorador))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed

        presionarBotonAtacar(personajeEjemplo);
        
    }//GEN-LAST:event_btnAtacarActionPerformed

    public void presionarBotonAtacar(Personaje miPerso){
        if (miPerso.getClass() == miPersonaje.getClass()) {
            miPersonaje.Atacar();
            lblPersonaje2.setIcon(miPersonaje.getSpriteActivo());
            hilo = new Thread(this, "hilo");
            hilo.start();
        }else{
            miPerso.Atacar();
        }     
    }
    
    
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

    private void btnAddDecoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDecoradorActionPerformed

        personajeEjemplo = new DecoradorLetra(personajeEjemplo);
        lblDaño.setText(String.valueOf(personajeEjemplo.getmiDaño()));
        lblVida.setText(String.valueOf(personajeEjemplo.getmiVida()));
        lblArmadura.setText(String.valueOf(personajeEjemplo.getmiArmadura()));
        lblVelocidad.setText(String.valueOf(personajeEjemplo.getmiVelocidad()));
    }//GEN-LAST:event_btnAddDecoradorActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDecorador;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblArmadura;
    private javax.swing.JLabel lblDaño;
    private javax.swing.JLabel lblPersonaje2;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JLabel lblVida;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        cambiarSprite();
        lblPersonaje2.setIcon(miPersonaje.getSpriteActivo());
    }

}
