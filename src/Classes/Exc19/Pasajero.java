package Classes.Exc19;

import java.util.ArrayList;
import java.util.List;

// Class Pasajero
class Pasajero {
    private String nombre;
    private String pasaporte;

    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }
}

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

// Class Reserva
class Reserva {
    private Vuelo vuelo;
    private Pasajero pasajero;
    private String fechaReserva;
    private int numeroAsiento;

    public Reserva(Vuelo vuelo, Pasajero pasajero) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.fechaReserva = "2024-11-11";  // Fecha de reserva (puede ser la fecha actual)
        this.numeroAsiento = vuelo.getAsientosDisponibles() + 1;  // El número de asiento es el último asiento disponible
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }
}

// Main class to demonstrate the flight reservation system
//public class SistemaReservasVuelos {
//    public static void main(String[] args) {
//        // Crear vuelos
//        Vuelo vuelo1 = new Vuelo("V123", "Madrid", "Barcelona", 3); // Vuelo con 3 asientos
//        Vuelo vuelo2 = new Vuelo("V124", "Madrid", "Valencia", 2); // Vuelo con 2 asientos
//
//        // Crear pasajeros
//        Pasajero pasajero1 = new Pasajero("Juan Pérez", "A12345678");
//        Pasajero pasajero2 = new Pasajero("María López", "B23456789");
//        Pasajero pasajero3 = new Pasajero("Carlos García", "C34567890");
//        Pasajero pasajero4 = new Pasajero("Ana Ruiz", "D45678901");
//
//        // Realizar reservas
//        vuelo1.reservarAsiento(pasajero1); // Reserva 1
//        vuelo1.reservarAsiento(pasajero2); // Reserva 2
//        vuelo1.reservarAsiento(pasajero3); // Reserva 3 (último asiento disponible)
//        vuelo1.reservarAsiento(pasajero4); // No hay asientos disponibles
//
//        // Mostrar reservas del vuelo
//        vuelo1.mostrarReservas();
//
//        // Cancelar una reserva
//        vuelo1.cancelarReserva(pasajero2); // Cancelar reserva de María López
//
//        // Mostrar reservas después de la cancelación
//        vuelo1.mostrarReservas();
//
//        // Realizar una nueva reserva en el vuelo después de la cancelación
//        vuelo1.reservarAsiento(pasajero4); // Ahora hay un asiento disponible para Ana Ruiz
//    }
//}

