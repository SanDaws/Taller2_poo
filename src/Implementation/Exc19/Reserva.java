package Implementation.Exc19;

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
