package Implementation.Exc20;

import java.util.ArrayList;
import java.util.List;

// Class representing the bank, which holds multiple accounts
class Banco {
    private List<CuentaBancaria> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    // Method to add a new account to the bank
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    // Method to find an account by its number
    public CuentaBancaria encontrarCuenta(String numeroCuenta) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;  // Return null if no account found
    }

    // Method to list all accounts in the bank
    public void listarCuentas() {
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println("Account: " + cuenta.getNumeroCuenta() + ", Holder: " + cuenta.getTitular() + ", Balance: " + cuenta.getSaldo());
        }
    }
}
