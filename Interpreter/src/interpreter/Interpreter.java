/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiantes
 */
public class Interpreter {

    public static String leerArchivo() throws FileNotFoundException, IOException {
        File archivito = new File("/archivito.ini");
        FileReader fr = new FileReader(archivito);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        return linea;
    }

    public static void main(String[] args) {
        String linea = "";
        String numeroAparte = "";
        int cont= 0;
        char arreglo[];
        String arregloNumerosUnicos[];        
        try {
            linea = leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Interpreter.class.getName()).log(Level.SEVERE, null, ex);
        }
        arreglo = linea.toCharArray();
        arregloNumerosUnicos = new String[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != ' ') {
                continue;
            } else {
                for (int j = cont; j < i; j++) {
                    numeroAparte = numeroAparte + String.valueOf(arreglo[j]);
                    cont = i+1;
                }
                arregloNumerosUnicos[i] = numeroAparte;
            }

        }
    }

}
