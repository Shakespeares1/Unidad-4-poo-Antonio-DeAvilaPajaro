/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejercicios;

public class EjercicioCuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public EjercicioCuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // Constructor con dos parámetros
    public EjercicioCuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }

    // Constructor con tres parámetros (sobrecarga)
    public EjercicioCuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }

    // Método main para probar
    public static void main(String[] args) {
        EjercicioCuentaBancaria cuenta1 = new EjercicioCuentaBancaria();
        EjercicioCuentaBancaria cuenta2 = new EjercicioCuentaBancaria("12345678", "Corriente");
        EjercicioCuentaBancaria cuenta3 = new EjercicioCuentaBancaria("98765432", 1500000.0, "Ahorros");

        System.out.println("Cuenta 1:");
        cuenta1.mostrarDetalles();
        System.out.println();

        System.out.println("Cuenta 2:");
        cuenta2.mostrarDetalles();
        System.out.println();

        System.out.println("Cuenta 3:");
        cuenta3.mostrarDetalles();
    }
}
