package Implementation.Exc18;

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
