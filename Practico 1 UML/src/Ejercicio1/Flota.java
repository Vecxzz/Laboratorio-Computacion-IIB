package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Flota {

    private List<Avion> aviones;

    public Flota() {
        aviones = new ArrayList<>();
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }

    public void removerAvion(Avion avion) {
        aviones.remove(avion);
    }

    public List<Avion> obtenerAviones() {
        return aviones;
    }
}