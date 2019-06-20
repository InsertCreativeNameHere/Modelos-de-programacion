/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author estudiantes
 */
public class ExpresionSuma extends Expresion {

    @Override
    public float intepretar() {
        return this.numero1.intepretar() + this.numero2.intepretar();
    }
    
}
