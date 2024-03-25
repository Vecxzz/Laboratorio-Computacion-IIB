package Ejercicio2;

public class Piloto extends Persona{
    private String empresa;

    public Piloto(String empresa) {
        this.empresa = empresa;
    }

    public Piloto(String nombre, int edad, String empresa) {
        super(nombre, edad);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Empresa: " + empresa;
    }
}