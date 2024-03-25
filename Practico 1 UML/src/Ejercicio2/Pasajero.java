package Ejercicio2;

public class Pasajero extends Persona{
    private String equipajeKg;
    private Reserva reserva;
    public Pasajero(String equipajeKg) {
        this.equipajeKg = equipajeKg;
    }

    public Pasajero(String nombre, int edad, String equipajeKg, String idReserva) {
        super(nombre, edad);
        this.equipajeKg = equipajeKg;
        this.reserva = new Reserva(idReserva);
    }

    public String getEquipajeKg() {
        return equipajeKg;
    }

    public void setEquipajeKg(String equipajeKg) {
        this.equipajeKg = equipajeKg;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public void mostrarReserva(){
        System.out.println("Reserva ID: "+this.reserva.getIdReserva()+" del pasajero: "+this.nombre);
        for(Vuelo v:this.reserva.getVuelos()){
            System.out.println("ID del vuelo: "+v.getIdVuelo());
            System.out.println("Origen: "+v.getOrigen());
            System.out.println("Destino: "+v.getDestino());
            System.out.println();
        }

    }
}