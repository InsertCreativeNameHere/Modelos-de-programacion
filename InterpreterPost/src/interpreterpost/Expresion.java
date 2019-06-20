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
public abstract class Expresion {
    
    protected String valor;
    protected Expresion numero1;
    protected Expresion numero2;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Expresion getNumero1() {
        return numero1;
    }

    public void setNumero1(Expresion numero1) {
        this.numero1 = numero1;
    }

    public Expresion getNumero2() {
        return numero2;
    }

    public void setNumero2(Expresion numero2) {
        this.numero2 = numero2;
    }
    
    
    
    public abstract float intepretar();
}
