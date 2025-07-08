/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.Ejercicio;

public class MainBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000000, "Ahorros");

        // ✅ Acceso permitido (es public)
        System.out.println("Tipo de cuenta: " + cuenta.tipoCuenta);

        // ✅ Acceso mediante métodos públicos
        cuenta.setSaldo(1200000);
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        // ❌ Acceso directo no permitido (esto genera error si se descomenta)
        // System.out.println("Número de cuenta: " + cuenta.numeroCuenta);

        cuenta.mostrarDetalles();
    }
}
