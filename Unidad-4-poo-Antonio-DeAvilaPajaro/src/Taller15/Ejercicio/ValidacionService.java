/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio;

public class ValidacionService {
    public boolean validarCredenciales(String nombre, String contrasena) {
        return nombre != null && !nombre.isEmpty() && contrasena != null && contrasena.length() >= 4;
    }
}

