package Implementation.Exc19;

import java.util.ArrayList;
import java.util.List;

// Class Vuelo
class Vuelo {
    private String codigoVuelo;
    private String origen;
    private String destino;
    private int asientosDisponibles;
    private List<Reserva> reservas;

    public Vuelo(String codigoVuelo, String origen, String destino, int totalAsientos) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.asientosDisponibles = totalAsientos;
        this.reservas = new ArrayList<>();
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    // Verificar disponibilidad de asientos
    public boolean verificarDisponibilidad() {
        return asientosDisponibles > 0;
    }

    // Reservar un asiento
    public boolean reservarAsiento(Pasajero pasajero) {
        if (verificarDisponibilidad()) {
            // Crear una reserva y añadirla a la lista de reservas
            Reserva reserva = new Reserva(this, pasajero);
            reservas.add(reserva);
            asientosDisponibles--;  // Reducir el número de asientos disponibles
            System.out.println("Reserva exitosa para " + pasajero.getNombre() + " en el vuelo " + codigoVuelo);
            return true;
        } else {
            System.out.println("Lo siento, no hay asientos disponibles en el vuelo " + codigoVuelo);
            return false;
        }
    }

    // Cancelar una reserva
    public boolean cancelarReserva(Pasajero pasajero) {
        for (Reserva reserva : reservas) {
            if (reserva.getPasajero().equals(pasajero)) {
                reservas.remove(reserva);
                asientosDisponibles++;  // Incrementar los asientos disponibles
                System.out.println("Reserva cancelada para " + pasajero.getNombre());
                return true;
            }
        }
        System.out.println("No se encontró ninguna reserva para el pasajero " + pasajero.getNombre());
        return false;
    }

    // Mostrar reservas actuales
    public void mostrarReservas() {
        System.out.println("Reservas para el vuelo " + codigoVuelo + ":");
        for (Reserva reserva : reservas) {
            System.out.println("Pasajero: " + reserva.getPasajero().getNombre() + ", Asiento: " + reserva.getNumeroAsiento() + ", Fecha: " + reserva.getFechaReserva());
        }
    }
}
