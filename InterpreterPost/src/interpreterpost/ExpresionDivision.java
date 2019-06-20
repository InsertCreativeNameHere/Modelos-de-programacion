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
public class ExpresionDivision extends Expresion {

    @Override
    public float intepretar() {
        return this.numero1.intepretar() / this.numero2.intepretar();
    }
    
}
