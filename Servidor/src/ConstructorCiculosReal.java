/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldani
 */
public class ConstructorCiculosReal implements ConstructorCirculos{
    private Circulo instancia;

    @Override
    public Circulo darInstancia(int clave) {
        return new Circulo(5, "circulino");
    }

    
}
