package Ejercicio1;

public class Vuelo {

    private int cant_pasajeros;
    private int id;
    private String origen;
    private String destino;
    private Avion avion;

    public Vuelo() {
    }

    public Vuelo(int cant_pasajeros, int id, String origen, String destino, Avion avion, Piloto piloto) {
        this.cant_pasajeros = cant_pasajeros;
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.avion = avion;
    }

    public int getCant_pasajeros() {
        return cant_pasajeros;
    }

    public void setCant_pasajeros(int cant_pasajeros) {
        this.cant_pasajeros = cant_pasajeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean reservarVuelo() {
        if (avion != null && avion.getCapacidad() > 0) {
            avion.setCapacidad(avion.getCapacidad() - 1);
            return true;
        } else {
            return false;
        }
    }
}
