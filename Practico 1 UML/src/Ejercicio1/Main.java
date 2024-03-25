package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        //Crear avión
        Avion a1 = new Avion(1, 100);

        //Crear piloto
        Piloto p1 = new Piloto(1, "Julían", "Ramirez", 35);

        //Crear una flota
        Flota flot = new Flota();
        flot.agregarAvion(a1);

        //Crear vuelo
        Vuelo vuelo = new Vuelo(2, 1, "Argentina", "Brasil", a1, p1);

        //Realizar reserva
        boolean reservaExitosa = vuelo.reservarVuelo();

        if (reservaExitosa) {
            System.out.println("La reserva del vuelo se realizo exitosamente");
            System.out.println("---------------------------");
            System.out.println("Detalles del vuelo: ");
            System.out.println("Origen: " + vuelo.getOrigen());
            System.out.println("Destino: " + vuelo.getDestino());
        } else {
            System.out.println("No se pudo realizar la reserva del vuelo, no hay asientos disponibles");
        }

    }
}