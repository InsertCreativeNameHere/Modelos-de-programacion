package BandaAleatoria;

public class Launcher {

    private Banda miBanda;
    public Launcher(){
        miBanda = new Banda();
    }

    public static void main(String [] args){
        Launcher l = new Launcher();
        l.miBanda.generarBanda();
        l.miBanda.tocar();
    }
}
