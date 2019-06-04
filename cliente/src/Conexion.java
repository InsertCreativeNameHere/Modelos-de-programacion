
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldani
 */
public class Conexion {
    
    private int puerto = 1312;
    private String host = "25.76.234.108";
    protected ServerSocket ss;
    protected Socket cs;
    protected InputStream entrada;
    protected OutputStream salida;
    protected ObjectOutputStream salidaCliente;
    protected DataOutputStream salidaServidor;
    
    public Conexion(String tipo) throws IOException //Constructor
    {
        if(tipo.equalsIgnoreCase("servidor"))
        {
            ss = new ServerSocket(puerto);//Se crea el socket para el servidor en puerto 1312
            cs = new Socket(); //Socket para el cliente
        }
        else
        {
            cs = new Socket(host, puerto); //Socket para el cliente en localhost en puerto 1312
        }
    }
    
}
