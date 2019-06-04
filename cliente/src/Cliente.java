
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldani
 */
public class Cliente extends Conexion{
    
    private Circulo circu = new Circulo(10, "circulono");
    private Object objeto;
    
    public Cliente() throws IOException {
        super("cliente"); 
    }
    
    public void iniciarConexion(){
        try {

            salida = cs.getOutputStream();
            entrada = cs.getInputStream();
            salidaServidor = new DataOutputStream(salida);
            ObjectInputStream entradaServidor = new ObjectInputStream(entrada);
            salidaServidor.writeUTF("k kresisi");
            salidaServidor.writeInt(1234);
            System.out.println("envie la clave");
            objeto = entradaServidor.readObject();
            System.out.println("lei el objeto");
            if(objeto instanceof Circulo){
                System.out.println("voy a castear el objeto");
                circu = (Circulo) objeto;
            }
            cs.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object getObjeto() {
        return objeto;
    }

    public Circulo getCircu() {
        return circu;
    }
    
    
    
}
