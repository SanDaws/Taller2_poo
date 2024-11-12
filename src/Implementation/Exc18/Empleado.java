package Implementation.Exc18;

// Class Employee
class Empleado {
    private String nombre;
    private double pagoPorHora;
    private double horasTrabajadas;

    public Empleado(String nombre, double pagoPorHora) {
        this.nombre = nombre;
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    // Method to register worked hours
    public void registrarHoras(double horas) {
        this.horasTrabajadas += horas;
        System.out.println(horas + " horas registradas para " + nombre);
    }
}
