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
public abstract class Expresion {
    
    protected String valor;
    protected Expresion numero1;
    protected Expresion numero2;
    
    public abstract float intepretar();
}
