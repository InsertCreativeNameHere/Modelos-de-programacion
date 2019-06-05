
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class Servidor extends Conexion {
    
    private Circulo objeto;
    private ConstructorCirculos contructor = new Proxy();
    
    public Servidor() throws IOException {
        super("servidor");
    }
    
    public void iniciarConexion(){
        try {
            System.out.println("esperando -.-");
            cs = ss.accept();
            System.out.println("un cliente se ha conectado , k kreisi");
            entrada = cs.getInputStream();
            salida = cs.getOutputStream();
            salidaCliente = new ObjectOutputStream(salida);
            DataInputStream entradaCliente = new DataInputStream(entrada);
            
            Object a = entradaCliente.readInt();
            System.out.println(a.toString());
            objeto = contructor.darInstancia((int) a);
            System.out.println("voy a enviar el objeto");
            salidaCliente.writeObject(objeto);
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
