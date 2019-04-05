package BandaAleatoria;

public class Launcher {

    private final Banda miBanda;
    public Launcher(){
        miBanda = new Banda();
        miBanda.generarMusicos();
        miBanda.afinarInstrumentos();
        miBanda.tocar();
    }

    public static void main(String [] args){
       new Launcher();
        
    }
}
