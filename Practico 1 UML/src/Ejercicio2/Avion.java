package Ejercicio2;

public class Avion {
    private String modelo;
    private String numeroSerie;
    private Piloto piloto;
    private Vuelo vueloAsignado;

    public Avion() {
    }

    public Avion(String modelo, String numeroSerie, String nombre, int edad, String empresa) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.piloto = new Piloto (nombre, edad, empresa);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Vuelo getVueloAsignado() {
        return vueloAsignado;
    }

    public void setVueloAsignado(Vuelo vueloPorAsignar) {
        this.vueloAsignado = vueloPorAsignar;
    }
    public void mostrarDatosAvion(){
        System.out.println("Modelo del avíon: "+this.modelo);
        System.out.println("Número de serie: "+this.numeroSerie);
        System.out.println("Piloto asignado: "+this.piloto);
        if (vueloAsignado == null){
            System.out.println("El avión no tiene un vuelo asignado");
        }else{
            System.out.println("Vuelo asignado: "+this.vueloAsignado.getIdVuelo());}
    }
}