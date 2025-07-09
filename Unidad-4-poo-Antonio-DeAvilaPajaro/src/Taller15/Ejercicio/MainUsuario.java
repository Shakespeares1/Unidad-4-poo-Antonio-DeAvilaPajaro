/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");

        ValidacionService validador = new ValidacionService();
        AutenticacionService autenticador = new AutenticacionService();

        if (validador.validarCredenciales(usuario.getNombre(), usuario.getContrasena())) {
            if (autenticador.autenticar(usuario, "1234")) {
                System.out.println("Autenticación exitosa.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        } else {
            System.out.println("Datos inválidos.");
        }
    }
}
