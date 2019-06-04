
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldani
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Cliente client = new Cliente(); //Se crea el servidor
        System.out.println("Iniciando cliente\n");
        client.iniciarConexion(); //Se inicia el servidorervidor serv = new Servidor(); //Se crea el servidor
        System.out.println(client.getCircu().getNombre());
    }
    
}
