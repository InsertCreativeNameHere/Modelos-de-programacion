package BandaAleatoria;

public final class Guitarra implements Instrumento {

    //Atributos
    
    private String nombre;

    public Guitarra() {
        
        nombre = "Guitarra";
    }

    //Metodos
    public void afinar() {
        System.out.println("Afinando el: " + nombre);
    }
    public void reproducir(){
        System.out.println("Tocando: " + nombre);                
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String darInfo() {
        return this.nombre;
    }

}
