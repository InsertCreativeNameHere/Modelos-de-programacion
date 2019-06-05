
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
public class Proxy implements ConstructorCirculos{

    private ConstructorCiculosReal c = new ConstructorCiculosReal();
    
    @Override
    public Circulo darInstancia(int clave) {
        if (clave == 1234){
            return c.darInstancia(clave);
        }else{
            return new Circulo(0, "Constraseña equivocada");
        }
    }
    
}
