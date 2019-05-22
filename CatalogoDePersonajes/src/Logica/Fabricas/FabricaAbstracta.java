/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Fabricas;

/**
 *
 * @author ldani
 */
public interface FabricaAbstracta {
    
    public void crearCiudad();
    public void crearCuerpo();
    public void crearArma();
    public void crearMontura();
    public void crearArmadura();
    public Ciudad getMiCiudad();
    public Arma getMiArma();
    public Cuerpo getMiCuerpo();
    public Armadura getMiArmadura();
    public Montura getMiMontura();
    public Musica getMiMusica();
    public Escritura getMiEscritura();
}
