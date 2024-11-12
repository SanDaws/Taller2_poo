package Classes.Exc18;
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

// Class ControlDeHoras
class ControlDeHoras {
    private static final double HORAS_EXTRA_LIMITE = 40.0; // Maximum normal working hours
    private static final double PAGO_EXTRA_MULTIPLICADOR = 1.5; // Extra pay multiplier for overtime

    // Method to calculate weekly salary
    public static double calcularSalario(Empleado empleado) {
        double salario = 0.0;
        double horasNormales = Math.min(empleado.getHorasTrabajadas(), HORAS_EXTRA_LIMITE);
        double horasExtra = Math.max(empleado.getHorasTrabajadas() - HORAS_EXTRA_LIMITE, 0);

        salario += horasNormales * empleado.getPagoPorHora();
        salario += horasExtra * empleado.getPagoPorHora() * PAGO_EXTRA_MULTIPLICADOR;

        return salario;
    }

    // Method to display the salary details
    public static void mostrarDetallesSalario(Empleado empleado) {
        double salario = calcularSalario(empleado);
        double horasNormales = Math.min(empleado.getHorasTrabajadas(), HORAS_EXTRA_LIMITE);
        double horasExtra = Math.max(empleado.getHorasTrabajadas() - HORAS_EXTRA_LIMITE, 0);

        System.out.println("Detalles de salario de " + empleado.getNombre() + ":");
        System.out.println("Horas normales trabajadas: " + horasNormales);
        System.out.println("Horas extras trabajadas: " + horasExtra);
        System.out.println("Pago por hora: $" + empleado.getPagoPorHora());
        System.out.println("Salario semanal total: $" + salario);
    }
}

// Main class to demonstrate the hours control system
public class SistemaControlHoras {
    public static void main(String[] args) {
        // Crear empleado
        Empleado empleado = new Empleado("Juan Pérez", 15.0);

        // Registrar horas trabajadas
        empleado.registrarHoras(45); // 45 horas trabajadas (5 horas extras)

        // Calcular y mostrar detalles del salario
        ControlDeHoras.mostrarDetallesSalario(empleado);
    }
}
