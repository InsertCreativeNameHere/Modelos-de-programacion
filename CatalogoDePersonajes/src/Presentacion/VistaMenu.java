package Presentacion;

import Logica.FabricaAbstracta;
import Logica.FabricaDoomSlayer;
import Logica.FabricaElfo;
import Logica.FabricaHumano;
import Logica.FabricaOrco;
import Logica.FabricaTrygve;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public final class VistaMenu extends javax.swing.JFrame {

    FabricaAbstracta miFabrica;

    public VistaMenu() throws IOException, LineUnavailableException, UnsupportedAudioFileException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ponerBotonesImagen();
        this.AnimarFondo();
    }

    public void ponerBotonesImagen() throws IOException {
        BufferedImage imgHumano = ImageIO.read(new File("img/HumanoBoton.png"));
        Fondo fondoHumano = new Fondo(imgHumano);
        btnHumanos.setBorder(fondoHumano);

        BufferedImage imgOrco = ImageIO.read(new File("img/OrcoBoton.png"));
        Fondo fondoOrco = new Fondo(imgOrco);
        btnOrcos.setBorder(fondoOrco);

        BufferedImage imgElfo = ImageIO.read(new File("img/ElfoBoton.png"));
        Fondo fondoElfo = new Fondo(imgElfo);
        btnElfos.setBorder(fondoElfo);

        BufferedImage imgDoom = ImageIO.read(new File("img/DoomSlayerBoton.png"));
        Fondo fondoDoom = new Fondo(imgDoom);
        btnDoomSlayers.setBorder(fondoDoom);

        BufferedImage imgTrygve = ImageIO.read(new File("img/TrygveBoton.png"));
        Fondo fondoTrygve = new Fondo(imgTrygve);
        btnTrygves.setBorder(fondoTrygve);

    }

    public void AnimarFondo() {
        lblFondo.setLocation(0, 0);
        lblFondo.setIcon(new javax.swing.ImageIcon("img/Fondo.gif"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHumanos = new javax.swing.JButton();
        btnElfos = new javax.swing.JButton();
        btnDoomSlayers = new javax.swing.JButton();
        btnTrygves = new javax.swing.JButton();
        btnOrcos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblmenu = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHumanos.setText("Humanos");
        btnHumanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHumanosActionPerformed(evt);
            }
        });
        getContentPane().add(btnHumanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 166, 275));

        btnElfos.setText("Elfos");
        btnElfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElfosActionPerformed(evt);
            }
        });
        getContentPane().add(btnElfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 68, 166, 275));

        btnDoomSlayers.setText("DoomSlayers");
        btnDoomSlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoomSlayersActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoomSlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 68, 166, 275));

        btnTrygves.setText("Trygves");
        btnTrygves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrygvesActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrygves, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 68, 166, 275));

        btnOrcos.setText("Orcos");
        btnOrcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrcosActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrcos, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 68, 166, 275));

        btnSalir.setFont(new java.awt.Font("Trajan Pro", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 79, 39));

        lblmenu.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        lblmenu.setForeground(new java.awt.Color(183, 10, 10));
        lblmenu.setText("Elija su raza");
        getContentPane().add(lblmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHumanosActionPerformed

        try {
            miFabrica = new FabricaHumano();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        VistaWiki v;
        try {
            v = new VistaWiki(miFabrica);
            v.setVisible(true);
            v.setLocationRelativeTo(null);

        } catch (IOException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnHumanosActionPerformed

    private void btnElfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElfosActionPerformed
        try {
            miFabrica = new FabricaElfo();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        VistaWiki v;
        try {
            v = new VistaWiki(miFabrica);
            v.setVisible(true);
            v.setLocationRelativeTo(null);

        } catch (IOException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnElfosActionPerformed

    private void btnDoomSlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoomSlayersActionPerformed
        try {
            miFabrica = new FabricaDoomSlayer();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        VistaWiki v;
        try {
            v = new VistaWiki(miFabrica);
            v.setVisible(true);
            v.setLocationRelativeTo(null);

        } catch (IOException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDoomSlayersActionPerformed

    private void btnTrygvesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrygvesActionPerformed
        try {
            miFabrica = new FabricaTrygve();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        VistaWiki v;
        try {
            v = new VistaWiki(miFabrica);
            v.setVisible(true);
            v.setLocationRelativeTo(null);

        } catch (IOException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTrygvesActionPerformed

    private void btnOrcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrcosActionPerformed
        try {
            miFabrica = new FabricaOrco();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        VistaWiki v;
        try {
            v = new VistaWiki(miFabrica);
            v.setVisible(true);
            v.setLocationRelativeTo(null);

        } catch (IOException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOrcosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VistaMenu().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoomSlayers;
    private javax.swing.JButton btnElfos;
    private javax.swing.JButton btnHumanos;
    private javax.swing.JButton btnOrcos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTrygves;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblmenu;
    // End of variables declaration//GEN-END:variables
}
