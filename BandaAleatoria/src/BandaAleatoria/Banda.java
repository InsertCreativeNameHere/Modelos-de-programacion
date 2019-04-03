package BandaAleatoria;

public class Banda {

    //Atributos
    private int numeroDeMusicos;
    private Musico[] misMusicos;
    //Metodo constructor

    public Banda() {
        numeroDeMusicos = (int) Math.floor(Math.random() * 20) + 1;
        misMusicos = new Musico[numeroDeMusicos];
        System.out.println("se han asignado: " + numeroDeMusicos);
    }

    public void generarMusicos() {
        for (int i = 0; i <= numeroDeMusicos - 1; i++) {
            Musico m = new Musico();
            m.generarInstrumento(numeroDeMusicos);
            misMusicos[i] = m;
            System.out.println("El musico " + (i + 1) + " tiene un@ " + misMusicos[i].preguntarInstrumento());
        }

        for (int i = 0; i <= numeroDeMusicos - 1; i++) {
            misMusicos[i].afinarInstrumento();
        }

    }

    public void tocar() {
        for (int i = 0; i <= numeroDeMusicos - 1; i++) {
            misMusicos[i].tocarInstrumento();
        }
    }

}
