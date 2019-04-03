package BandaAleatoria;

public final class Guitarra implements Instrumento {

    //Atributos
    private int disponibilidad;
    private String nombre;

    public Guitarra() {
        disponibilidad = (int) Math.floor(Math.random() * 2);
        nombre = "Guitarra";
    }

    //Metodos
    public void afinar() {
        System.out.println("Afinando el: " + nombre);
    }
    public void reproducir(){
        System.out.println("Tocando: " + nombre);                
    }
    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
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
