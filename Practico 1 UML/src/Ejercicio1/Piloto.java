package Ejercicio1;

public class Piloto extends Persona implements Volador {

    public Piloto() {
    }

    public Piloto(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
    }

    @Override
    public void volar() {

    }
}