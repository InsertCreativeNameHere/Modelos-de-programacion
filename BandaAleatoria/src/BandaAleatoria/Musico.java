package BandaAleatoria;

public class Musico {

    private Instrumento miInstrumento;

    //metodos
    
    public Instrumento getMiInstrumento() {    
        
        return miInstrumento;
    }

    public void generarInstrumento(int n) {
        int i = (int) Math.floor(Math.random() * 4)+1;
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
        
    }
    

    public String preguntarInstrumento(){
        return miInstrumento.darInfo();
    }
    
    public void afinarInstrumento() {
        this.miInstrumento.afinar();
    }

    public void tocarInstrumento() {
        this.miInstrumento.reproducir();
    }
}
