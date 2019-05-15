package Presentacion;

import Logica.Director;
import Logica.FabricaAbstracta;
import Logica.PersonajeNativo;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class VistaWiki extends javax.swing.JFrame {

    private Clip musica;
    private PersonajeNativo miPersonaje;
    

    public VistaWiki(FabricaAbstracta fabri, Director di) throws IOException, LineUnavailableException, UnsupportedAudioFileException, UnsupportedAudioFileException {
        initComponents();
        this.ponerTransparencias();
        this.ponerFondo(fabri.getMiCiudad().getImg());
        this.ponerTexto(fabri);
        this.ponerImagen(fabri.getMiCuerpo().getImg(), fabri.getMiMontura().getImg(), fabri.getMiArma().getImg(), fabri.getMiArmadura().getImg());
        this.AsignarFuente(fabri.getMiEscritura().getIdioma());
        this.ponerMusica(fabri.getMiMusica().getMusica());
        miPersonaje = darPersonaje(di);
    }

    public void ponerTransparencias() {
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

    public void ponerFondo(BufferedImage img) throws IOException {
        Fondo mifondo = new Fondo(img);
        JPanel panel = (JPanel) this.getContentPane();
        panel.setBorder(mifondo);
    }

    
    
    
    public void ponerTexto(FabricaAbstracta fabrica) {
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
        lblImagenCuerpo = new javax.swing.JLabel();
        lblImagenMontura = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblCuerpo = new javax.swing.JLabel();
        lblArma = new javax.swing.JLabel();
        lblArmadura = new javax.swing.JLabel();
        lblMonturatxt = new javax.swing.JLabel();
        lblImagenArma = new javax.swing.JLabel();
        lblImagenArmadura = new javax.swing.JLabel();
        btnSeleccionarRaza = new javax.swing.JButton();

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

        lblCiudad.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        lblCiudad.setText("Ciudad");

        lblCuerpo.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        lblCuerpo.setText("Cuerpo");

        lblArma.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        lblArma.setText("Arma");

        lblArmadura.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        lblArmadura.setText("Armadura");

        lblMonturatxt.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        lblMonturatxt.setText("Montura");

        btnSeleccionarRaza.setText("Seleccionar Raza");
        btnSeleccionarRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarRazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeleccionarRaza))
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImagenCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblImagenArma, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImagenMontura, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblImagenArmadura, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagenArma, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCiudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblCuerpo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImagenCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(scrollMontura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblImagenArmadura, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(lblImagenMontura, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnSeleccionarRaza))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ponerImagen(ImageIcon imgCuerpo, ImageIcon imgMontura, ImageIcon imgArma, ImageIcon imgArmadura) {
        lblImagenCuerpo.setIcon(imgCuerpo);
        lblImagenMontura.setIcon(imgMontura);
        lblImagenArma.setIcon(imgArma);
        lblImagenArmadura.setIcon(imgArmadura);

    }

    public void ponerMusica(Clip m) {
        musica = m;
        musica.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void AsignarFuente(Font estilo) {
        txtAreaCiudad.setFont(estilo);
        txtAreaArma.setFont(estilo);
        txtAreaArmadura.setFont(estilo);
        txtAreaCuerpo.setFont(estilo);
        txtAreaMontura.setFont(estilo);
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
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VistaWiki.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VistaWiki.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnVolverActionPerformed
 
    public PersonajeNativo darPersonaje(Director miDiri){
        miDiri.construirPersonaje();
        return miDiri.obtenerPersonaje();
    }
    
    private void btnSeleccionarRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarRazaActionPerformed

        musica.stop();
        musica.close();
        VistaJuego v = new VistaJuego(miPersonaje);
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSeleccionarRazaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarRaza;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblArma;
    private javax.swing.JLabel lblArmadura;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCuerpo;
    private javax.swing.JLabel lblImagenArma;
    private javax.swing.JLabel lblImagenArmadura;
    private javax.swing.JLabel lblImagenCuerpo;
    private javax.swing.JLabel lblImagenMontura;
    private javax.swing.JLabel lblMonturatxt;
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
