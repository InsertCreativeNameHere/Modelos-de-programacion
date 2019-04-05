package BandaAleatoria;

public class Banda {

    //ATRIBUTOS
    private int numeroDeMusicos;
    private Musico[] misMusicos;
    //METODO CONSTRUCTOR

    public Banda() {
        try {
            numeroDeMusicos = (int) Math.floor(Math.random() * 20) + 1;
            misMusicos = new Musico[numeroDeMusicos];
            System.out.println("Se han asignado " + numeroDeMusicos + " musicos");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    //METODOS

    /**
     * Metodo para llenar el arreglo de musicos
     */
    public void generarMusicos() {
        try {
            for (int i = 0; i <= numeroDeMusicos - 1; i++) {
                Musico m = new Musico();
                m.generarInstrumento(numeroDeMusicos);
                misMusicos[i] = m;
                System.out.println("El musico " + (i + 1) + " tiene un@ " + misMusicos[i].preguntarInstrumento());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    /**
     * Metodo de mensaje de consola (afinar instrumentos)
     */
    public void afinarInstrumentos() {
        try {
            for (int i = 0; i <= numeroDeMusicos - 1; i++) {
                misMusicos[i].afinarInstrumento();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     *Metodo de mensaje de consola (tocar instrumentos)
     */
    public void tocar() {
        try {
            for (int i = 0; i <= numeroDeMusicos - 1; i++) {
                misMusicos[i].tocarInstrumento();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
