
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
            objeto = new Circulo(5, "ciruculino");
            salidaCliente.writeObject(objeto);
            ss.close();
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
