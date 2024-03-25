package Ejercicio1;

public class Reserva {

    private int id;
    private Persona pasajero;
    private Vuelo vuelo;

    public Reserva() {
    }

    public Reserva(int id, Persona pasajero, Vuelo vuelo) {
        this.id = id;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getPasajero() {
        return pasajero;
    }

    public void setPasajero(Persona pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}