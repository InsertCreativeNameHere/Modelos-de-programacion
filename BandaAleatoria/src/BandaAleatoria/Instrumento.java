package BandaAleatoria;

public interface Instrumento {

    //Métodos
    public abstract String darInfo();

    public abstract void afinar();
    
    public abstract int getDisponibilidad();
    
    public abstract void reproducir();
}
