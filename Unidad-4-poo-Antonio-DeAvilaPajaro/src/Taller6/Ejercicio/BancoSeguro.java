/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejercicio;

// Encapsulamiento adecuado
public class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo seguro: $" + saldo);
    }
}
