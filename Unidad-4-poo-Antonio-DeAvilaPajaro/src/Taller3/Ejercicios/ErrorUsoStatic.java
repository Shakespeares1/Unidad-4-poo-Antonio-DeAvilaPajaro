/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejercicios;

public class ErrorUsoStatic {
    private String mensaje = "Hola desde una instancia";

    // ❌ Esto causaría error si se descomenta
    /*
    public static void mostrarMensaje() {
        System.out.println(this.mensaje); // Error: no se puede usar this en método static
    }
    */

    // ✅ Corrección
    public void mostrarMensajeBien() {
        System.out.println(this.mensaje); // Correcto: dentro de método no static
    }

    public static void main(String[] args) {
        // ErrorUsoStatic.mostrarMensaje(); // No se puede usar porque da error si se activa
        ErrorUsoStatic obj = new ErrorUsoStatic();
        obj.mostrarMensajeBien(); // Correcto
    }
}

