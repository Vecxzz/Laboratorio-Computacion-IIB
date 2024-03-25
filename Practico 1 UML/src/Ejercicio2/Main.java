package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo("324F","Argentina","Portugal");
        Vuelo vuelo2 = new Vuelo("324G", "Portugal","México");
        Pasajero pasajero1 = new Pasajero("José Pérez",28,"121 kg","1");
        pasajero1.getReserva().agregarVuelo(vuelo1);
        pasajero1.getReserva().agregarVuelo(vuelo2);
        pasajero1.mostrarReserva();

        Avion avion1 = new Avion("'modeloAvión'","358FH41","Roberto Torres",37,"Aerolíneas Argentinas");
        Avion avion2 = new Avion("'modeloAvión'","851C321A","Felipe Gonzalez",34,"Aerolíneas Argentinas");
        avion1.setVueloAsignado(vuelo1);
        avion1.mostrarDatosAvion();
        avion2.mostrarDatosAvion();
    }
}