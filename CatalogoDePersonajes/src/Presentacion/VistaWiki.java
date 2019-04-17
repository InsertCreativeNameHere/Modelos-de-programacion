/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.FabricaAbstracta;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author javie
 */
public class VistaWiki extends javax.swing.JFrame {

    private Clip musica;
    
    public VistaWiki(FabricaAbstracta fabri) throws IOException, LineUnavailableException, UnsupportedAudioFileException, UnsupportedAudioFileException {
       initComponents();   
        
       this.ponerTransparencias();   
       this.ponerFondo(fabri.getMiCiudad().getClase());
       this.ponerTexto(fabri);
       this.ponerImagen(fabri.getMiCiudad().getClase());
        try {
            this.ponerMusica(fabri.getMiCiudad().getClase());
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaWiki.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void ponerTransparencias(){
       txtAreaCiudad.setForeground(Color.white);
       scrollCiudad.setOpaque(false);
       scrollCiudad.getViewport().setOpaque(false);
       scrollCiudad.setBorder(null);
       scrollCiudad.setViewportBorder(null);
       
       txtAreaCiudad.setBorder(null);
       txtAreaCiudad.setBackground(new Color(0, 0, 0, 64));
       
       txtAreaCuerpo.setForeground(Color.white);
       scrollCuerpo.setOpaque(false);
       scrollCuerpo.getViewport().setOpaque(false);
       scrollCuerpo.setBorder(null);
       scrollCuerpo.setViewportBorder(null);
       
       txtAreaCuerpo.setBorder(null);
       txtAreaCuerpo.setBackground(new Color(0, 0, 0, 64));
       
       txtAreaArma.setForeground(Color.white);
       scrollArma.setOpaque(false);
       scrollArma.getViewport().setOpaque(false);
       scrollArma.setBorder(null);
       scrollArma.setViewportBorder(null);
       
       txtAreaArma.setBorder(null);
       txtAreaArma.setBackground(new Color(0, 0, 0, 64));
       
       txtAreaArmadura.setForeground(Color.white);
       scrollArmadura.setOpaque(false);
       scrollArmadura.getViewport().setOpaque(false);
       scrollArmadura.setBorder(null);
       scrollArmadura.setViewportBorder(null);
       
       txtAreaArmadura.setBorder(null);
       txtAreaArmadura.setBackground(new Color(0, 0, 0, 64));
       
       txtAreaMontura.setForeground(Color.white);
       scrollMontura.setOpaque(false);
       scrollMontura.getViewport().setOpaque(false);
       scrollMontura.setBorder(null);
       scrollMontura.setViewportBorder(null);
       
       txtAreaMontura.setBorder(null);
       txtAreaMontura.setBackground(new Color(0, 0, 0, 64));
    }
    
    public void ponerFondo(String raza) throws IOException{
        BufferedImage img = null;
        switch(raza){
            case "Humanos":
                img = ImageIO.read(new File("img/Meridian.png"));
                break;
        }
        Fondo mifondo = new Fondo(img);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setBorder(mifondo);
    }
    
    public void ponerTexto(FabricaAbstracta fabrica){
        txtAreaCiudad.setText(fabrica.getMiCiudad().getDescripcion());
        txtAreaCiudad.setLineWrap(true);
        txtAreaCiudad.setEditable(false);
        
        txtAreaCuerpo.setText(fabrica.getMiCuerpo().getDescripcion());
        txtAreaCuerpo.setLineWrap(true);
        txtAreaCuerpo.setEditable(false);
        
        txtAreaArma.setText(fabrica.getMiArma().getDescripcion());
        txtAreaArma.setLineWrap(true);
        txtAreaArma.setEditable(false);
        
        txtAreaArmadura.setText(fabrica.getMiArmadura().getDescripcion());
        txtAreaArmadura.setLineWrap(true);
        txtAreaArmadura.setEditable(false);
        
        txtAreaMontura.setText(fabrica.getMiMontura().getDescripcion());     
        txtAreaMontura.setLineWrap(true);
        txtAreaMontura.setEditable(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollCiudad = new javax.swing.JScrollPane();
        txtAreaCiudad = new javax.swing.JTextArea();
        scrollCuerpo = new javax.swing.JScrollPane();
        txtAreaCuerpo = new javax.swing.JTextArea();
        scrollMontura = new javax.swing.JScrollPane();
        txtAreaMontura = new javax.swing.JTextArea();
        scrollArma = new javax.swing.JScrollPane();
        txtAreaArma = new javax.swing.JTextArea();
        scrollArmadura = new javax.swing.JScrollPane();
        txtAreaArmadura = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();
        lblRaza = new javax.swing.JLabel();
        lblMontura = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblCuerpo = new javax.swing.JLabel();
        lblArma = new javax.swing.JLabel();
        lblArmadura = new javax.swing.JLabel();
        lblMonturatxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1200, 750));

        txtAreaCiudad.setColumns(20);
        txtAreaCiudad.setRows(5);
        scrollCiudad.setViewportView(txtAreaCiudad);

        txtAreaCuerpo.setColumns(20);
        txtAreaCuerpo.setRows(5);
        scrollCuerpo.setViewportView(txtAreaCuerpo);

        txtAreaMontura.setColumns(20);
        txtAreaMontura.setRows(5);
        scrollMontura.setViewportView(txtAreaMontura);

        txtAreaArma.setColumns(20);
        txtAreaArma.setRows(5);
        scrollArma.setViewportView(txtAreaArma);

        txtAreaArmadura.setColumns(20);
        txtAreaArmadura.setRows(5);
        scrollArmadura.setViewportView(txtAreaArmadura);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblCiudad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCiudad.setText("Ciudad");

        lblCuerpo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCuerpo.setText("Cuerpo");

        lblArma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblArma.setText("Arma");

        lblArmadura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblArmadura.setText("Armadura");

        lblMonturatxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMonturatxt.setText("Montura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrollArma, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblArma))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblArmadura)
                                    .addComponent(scrollArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(scrollMontura, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMonturatxt)
                            .addComponent(lblCuerpo)
                            .addComponent(scrollCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCiudad)
                            .addComponent(scrollCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMontura, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCiudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblCuerpo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblMontura, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblArma)
                            .addComponent(lblArmadura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMonturatxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollMontura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(btnVolver))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ponerImagen(String raza){
        switch(raza){
            case "Humanos": 
                lblRaza.setIcon(new ImageIcon("img/Humano.png"));
                lblMontura.setIcon(new ImageIcon("img/MonturaHumano.png"));
                break; 
                
        }
        
    }
    
    
    public void ponerMusica(String raza) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
       switch(raza){
           case "Humanos":
               musica =  AudioSystem.getClip();
               musica.open(AudioSystem.getAudioInputStream(new File("Musica/Humanos.wav")));
               musica.loop(Clip.LOOP_CONTINUOUSLY);
               
               break;
       }
       
    }
    
    
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        musica.stop();
        musica.close();
        this.dispose();
        VistaMenu v;
        try {
            v = new VistaMenu();
            v.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(VistaWiki.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnVolverActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblArma;
    private javax.swing.JLabel lblArmadura;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCuerpo;
    private javax.swing.JLabel lblMontura;
    private javax.swing.JLabel lblMonturatxt;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JScrollPane scrollArma;
    private javax.swing.JScrollPane scrollArmadura;
    private javax.swing.JScrollPane scrollCiudad;
    private javax.swing.JScrollPane scrollCuerpo;
    private javax.swing.JScrollPane scrollMontura;
    private javax.swing.JTextArea txtAreaArma;
    private javax.swing.JTextArea txtAreaArmadura;
    private javax.swing.JTextArea txtAreaCiudad;
    private javax.swing.JTextArea txtAreaCuerpo;
    private javax.swing.JTextArea txtAreaMontura;
    // End of variables declaration//GEN-END:variables
}
