
package Logica.Adaptadores;
import Logica.Constructores.Personaje;
import Logica.Fabricas.MusicaHumana;
import catalogopersonajes.Personajes;
import catalogopersonajes.absPersonajes;
import java.awt.Image;
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
/**
 *
 * @author ldani
 */
public class Adaptador implements Personaje{

    private absPersonajes a = new Personajes("Enano");
    
    
    
    @Override
    public void Atacar() {
        a.getPj().atatcar(a.getPj());
    }

    @Override
    public String getMiArmaDesc() {
        return a.getPj().getArma().descripcion();
    }

    @Override
    public String getMiArmaduraDesc() {
        return a.getPj().getEscudo().descripcion();
    }

    @Override
    public String getMiMonturaDesc() {
        return a.getPj().getCaballeria().descripcion();
    }

    @Override
    public String getMiCuerpoDesc() {
       return "Los enanos miden en promedio 1.2 m y ademas de esto todos poseen barba"
               + " suelen pesar aproximadamente 60KG y poseen una piel muy resistente";
    }

    @Override
    public String getMiCiudadDesc() {
       return "los enanos,a pesar de ser monturas de los humanos, creen que tienen dignidad, y por eso decidieron hacer "
               + "una ciudad debajo de las cloacas humanas.";
    }

    @Override
    public ImageIcon getmiArmaduraImg() {
        ImageIcon imagen;
        imagen = a.getPj().getEscudo().tipoEscudo();
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(266, 224, Image.SCALE_DEFAULT));
        return imagen;
    }

    @Override
    public ImageIcon getmiArmaImg() {
        ImageIcon imagen;
        imagen = a.getPj().getArma().tipoArma();
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(266, 224, Image.SCALE_DEFAULT));
        System.out.println(a.getPj().imagen(0));
        return imagen;
    }

    @Override
    public ImageIcon getmiMonturaImg() {
        ImageIcon imagen;
        imagen = a.getPj().getCaballeria().tipoCaballeria();
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(266, 224, Image.SCALE_DEFAULT));
        return imagen;
    }

    @Override
    public ImageIcon getmiCuerpoImg() {
        ImageIcon imagen;
        imagen = new ImageIcon(a.getClass().getResource(a.getPj().imagen(0)));
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(266, 224, Image.SCALE_DEFAULT));
        return imagen;
    }

    @Override
    public BufferedImage getmiCiudadImg() {
        BufferedImage a = null;
        try {
              a =ImageIO.read(new File("img/Ciudades/CloacasMeridian.png"));
        } catch (IOException ex) {
            Logger.getLogger(Adaptador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    @Override
    public Clip getmiMusica() {
        Clip musica = null;
        try {
            musica = AudioSystem.getClip();
            musica.open(AudioSystem.getAudioInputStream(new File("Musica/Enanos.wav")));
        } catch (IOException ex) {
            Logger.getLogger(MusicaHumana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Adaptador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Adaptador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return musica;
    }

    @Override
    public int getmiDaño() {
        return 25;
    }

    @Override
    public int getmiArmadura() {
       return 85;
    }

    @Override
    public int getmiVida() {
        return 290;
    }

    @Override
    public int getmiVelocidad() {
        return 10;
    }
    
    
    
}
