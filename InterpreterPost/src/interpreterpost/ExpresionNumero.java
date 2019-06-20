/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreterpost;

/**
 *
 * @author estudiantes
 */
public class ExpresionNumero extends Expresion {

    @Override
    public float intepretar() {
        return Float.parseFloat(this.valor);
        
    }
    
}
