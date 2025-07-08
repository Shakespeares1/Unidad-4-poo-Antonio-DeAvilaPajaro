/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejercicio;

public class MainBanco {
    public static void main(String[] args) {
        Banco bancoInseguro = new Banco(1000000);
        bancoInseguro.saldo = -5000; // Posible modificación directa: ❌ mala práctica
        bancoInseguro.mostrarSaldo();

        BancoSeguro bancoSeguro = new BancoSeguro(1000000);
        bancoSeguro.depositar(500000);
        bancoSeguro.retirar(200000);
        bancoSeguro.mostrarSaldo();
    }
}
