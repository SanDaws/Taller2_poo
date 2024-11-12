package Implementation.Exc18;

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
