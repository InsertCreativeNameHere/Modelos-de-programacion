package BandaAleatoria;

public class Musico {
    //ATRIBUTOS

    private Instrumento miInstrumento;

    //METODOS  
    /**
     * Metodo utilizado en la clase Banda para generar instrumentos en el array
     * @param n 
     */
    public void generarInstrumento(int n) {
        try {
            int i = (int) Math.floor(Math.random() * 4) + 1;
            switch (i) {
                case 1:
                    miInstrumento = new Guitarra();
                    break;
                case 2:
                    miInstrumento = new Clarinete();
                    break;
                case 3:
                    miInstrumento = new Piano();
                    break;
                case 4:
                    miInstrumento = new TrianguloElectrico();
                    break;
                default:
                    System.out.println("Error");

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public String preguntarInstrumento() {
        return miInstrumento.darInfo();
    }

    public void afinarInstrumento() {
        this.miInstrumento.afinar();
    }

    public void tocarInstrumento() {
        this.miInstrumento.reproducir();
    }

    public Instrumento getMiInstrumento() {
        return miInstrumento;
    }
}
