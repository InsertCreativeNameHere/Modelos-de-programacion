package Presentacion;

import Logica.Adaptadores.Adaptador;
import Logica.Constructores.Personaje;
import Logica.Constructores.PersonajeNativo;
import Logica.Decorador.DecoradorLetra;
import com.sun.java.swing.plaf.motif.MotifTreeCellRenderer;
import java.awt.Image;
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
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class VistaJuego extends javax.swing.JFrame implements Runnable {

    PersonajeNativo miPersonaje;
    Personaje personajeEjemplo;
    int contador;
    Thread hilo;
    private int cont=0;

    public VistaJuego(Personaje perso) {
        initComponents();
        int mitadh = (int) (this.getSize().height / 2);
        lblImagenLlama.setLocation(mitadh,10);
        getContentPane().setComponentZOrder(lblImagenLlama, 0);       
        getContentPane().setComponentZOrder(lblPersonaje2, 1);
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
        lblImagenLlama = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, -1, -1));

        btnAtacar.setText("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));
        getContentPane().add(lblImagenLlama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, 200));
        getContentPane().add(lblPersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 292, 278));

        lblVida.setText("Vida");
        getContentPane().add(lblVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        lblDaño.setText("Daño");
        getContentPane().add(lblDaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        lblArmadura.setText("Armadura");
        getContentPane().add(lblArmadura, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        lblVelocidad.setText("Velocidad");
        getContentPane().add(lblVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        jLabel1.setText("Vida:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        jLabel2.setText("Daño:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        jLabel3.setText("Armadura:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jLabel4.setText("Velocidad: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        btnAddDecorador.setText("Agregar decorador");
        btnAddDecorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDecoradorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDecorador, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed

        presionarBotonAtacar(personajeEjemplo);

    }//GEN-LAST:event_btnAtacarActionPerformed

    public void presionarBotonAtacar(Personaje miPerso) {
        if (miPerso.getClass() == miPersonaje.getClass()) {
            miPersonaje.Atacar();
            lblPersonaje2.setIcon(miPersonaje.getSpriteActivo());
            hilo = new Thread(this, "hilo");
            hilo.start();
        } else {
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
        if(cont <=20){
        personajeEjemplo = new DecoradorLetra(personajeEjemplo);
        lblDaño.setText(String.valueOf(personajeEjemplo.getmiDaño()));
        lblVida.setText(String.valueOf(personajeEjemplo.getmiVida()));
        lblArmadura.setText(String.valueOf(personajeEjemplo.getmiArmadura()));
        lblVelocidad.setText(String.valueOf(personajeEjemplo.getmiVelocidad()));
        lblImagenLlama.setSize(10*cont, 10*cont);
        cont++;
        ImageIcon imagen;
        imagen = new ImageIcon("img/Poder.png");
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(10*cont, 10*cont, Image.SCALE_DEFAULT));
        lblImagenLlama.setIcon(imagen);              
        }else{
            JOptionPane.showMessageDialog(null, "Su poder no puede aumentar mas");
        }
       
        
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
    private javax.swing.JLabel lblImagenLlama;
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
