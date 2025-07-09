/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicio;

public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String contrasenaIngresada) {
        return usuario.getContrasena().equals(contrasenaIngresada);
    }
}

