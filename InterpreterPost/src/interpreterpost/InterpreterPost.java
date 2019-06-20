/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreterpost;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author javie
 */
public class InterpreterPost {

   public static String leerArchivo() throws FileNotFoundException, IOException {
        File archivito = new File("archivito.ini");
        FileReader fr = new FileReader(archivito);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        return linea;
    }
    
    public static float operar(String[] arreglo){
        Expresion x,y,z;
        x = new ExpresionNumero();
        y = new ExpresionNumero();
        int semaforo = 0;
        for(int i = 0; i < arreglo.length;i++){
            if(arreglo[i] == null){
                break;
            }
            switch(arreglo[i]){
                case "+":
                    z = new ExpresionSuma();
                    z.setNumero1(x);
                    y.setValor(String.valueOf(arreglo[i+1]));
                    z.setNumero2(y);
                    x.setValor(String.valueOf(z.intepretar()));
                    break;
                case "-":
                    z = new ExpresionDiferencia();
                    z.setNumero1(x);
                    y.setValor(String.valueOf(arreglo[i+1]));
                    z.setNumero2(y);
                    x.setValor(String.valueOf(z.intepretar()));
                    break;
                case "*":
                    z = new ExpresionMultiplicacion();
                    z.setNumero1(x);
                    y.setValor(String.valueOf(arreglo[i+1]));
                    z.setNumero2(y);
                    x.setValor(String.valueOf(z.intepretar()));
                    break;
                case "/":
                    z = new ExpresionDivision();
                    z.setNumero1(x);
                    y.setValor(String.valueOf(arreglo[i+1]));
                    z.setNumero2(y);
                    x.setValor(String.valueOf(z.intepretar()));
                    break;
                default:
                    if (semaforo == 0){
                        x.setValor(arreglo[i]);
                        semaforo++;
                    }
                    break;
            }
        }
        return x.intepretar();
    }

    public static void main(String[] args) {
        String linea = "";
        String numeroAparte = "";
        int cont= 0;
        int cont2 = 0;
        char arreglo[];
        String arregloNumerosUnicos[];        
        try {
            linea = leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(InterpreterPost.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(linea);
        arreglo = linea.toCharArray();
        arregloNumerosUnicos = new String[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            if (i == arreglo.length - 1) {
                arregloNumerosUnicos[cont2] = String.valueOf(arreglo[i]);
                continue;
            } 
            if (arreglo[i] != ' ') {
                continue;
            } else {
                for (int j = cont; j < i; j++) {
                    numeroAparte = numeroAparte + String.valueOf(arreglo[j]);
                }
                cont = i+1;
                arregloNumerosUnicos[cont2] = numeroAparte;
                cont2++;
                numeroAparte = "";
            }
        }
        System.out.println("El resultado de la operacion es: "+operar(arregloNumerosUnicos));
    }
    
}
