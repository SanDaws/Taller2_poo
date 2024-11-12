package Implementation.Exc20;

import java.util.ArrayList;
import java.util.List;

// Class representing a bank account
class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private List<String> historialTransacciones;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historialTransacciones = new ArrayList<>();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<String> getHistorialTransacciones() {
        return historialTransacciones;
    }

    // Method to deposit money into the account
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            historialTransacciones.add("Deposited " + monto + " to account " + numeroCuenta);
        }
    }

    // Method to withdraw money from the account
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            historialTransacciones.add("Withdrew " + monto + " from account " + numeroCuenta);
            return true;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
            return false;
        }
    }

    // Method to transfer money to another account
    public boolean transferir(double monto, CuentaBancaria cuentaDestino) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            cuentaDestino.depositar(monto);
            historialTransacciones.add("Transferred " + monto + " to account " + cuentaDestino.getNumeroCuenta());
            cuentaDestino.getHistorialTransacciones().add("Received " + monto + " from account " + numeroCuenta);
            return true;
        } else {
            System.out.println("Insufficient funds for transfer.");
            return false;
        }
    }

    // Method to display the transaction history of the account
    public void mostrarHistorial() {
        System.out.println("Transaction History for account " + numeroCuenta + ":");
        for (String transaccion : historialTransacciones) {
            System.out.println(transaccion);
        }
    }
}

// Main class to demonstrate the bank and account functionalities
//+
