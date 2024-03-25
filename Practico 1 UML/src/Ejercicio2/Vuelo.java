package Ejercicio2;

public class Vuelo {
    private String idVuelo;
    private String origen;
    private String destino;

    public Vuelo() {
    }

    public Vuelo(String idVuelo, String origen, String destino) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
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
}