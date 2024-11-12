package Implementation.Exc19;

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

