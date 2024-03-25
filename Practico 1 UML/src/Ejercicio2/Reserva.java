package Ejercicio2;

import java.util.ArrayList;

public class Reserva {
    private String idReserva;
    private ArrayList<Vuelo> vuelos = new ArrayList<>();
    public Reserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public void agregarVuelo(Vuelo vueloNuevo){
        vuelos.add(vueloNuevo);
    }
}