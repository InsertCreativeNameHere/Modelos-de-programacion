
import java.io.DataOutputStream;
import java.io.IOException;
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
    
    private Object objeto;
    
    public Cliente(String tipo) throws IOException {
        super("cliente"); 
    }
    
    public void iniciarConexion(){
        try {
            salida = cs.getOutputStream();
            salidaServidor = new ObjectOutputStream(salida);
            salidaServidor.writeUTF("k kresisi");
            cs.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
