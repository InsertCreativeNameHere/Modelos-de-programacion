/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author ldani
 */
public class FabricaHumanos implements FabricaAbstracta{

    private Ciudad miCiudad;
    private Cuerpo miCuerpo;
    private Arma miArma;
    private Montura miMontura;
    private Armadura miArmadura;
    
    public void crearCiudad() {
        miCiudad = new CiudadHumana();
    }


    public void crearCuerpo() {
        miCuerpo = new CuerpoHumano();
    }

  
    public void crearArma() {
        miArma = new ArmaHumana();
    }

    
    public void crearMontura() {
        miMontura = new MonturaHumana();
    }

   
    public void crearArmadura() {
        miArmadura = new ArmaduraHumana();
    }

    public FabricaHumanos() {
        this.crearArma();
        this.crearArmadura();
        this.crearCiudad();
        this.crearCuerpo();
        this.crearMontura();
    }

    public Ciudad getMiCiudad() {
        return miCiudad;
    }

    public Cuerpo getMiCuerpo() {
        return miCuerpo;
    }

    public Arma getMiArma() {
        return miArma;
    }

    public Montura getMiMontura() {
        return miMontura;
    }

    public Armadura getMiArmadura() {
        return miArmadura;
    }
    
    
    
    
    
    
}
