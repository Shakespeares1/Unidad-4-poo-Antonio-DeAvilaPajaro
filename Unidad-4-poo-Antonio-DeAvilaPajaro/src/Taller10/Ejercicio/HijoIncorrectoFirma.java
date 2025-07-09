/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejercicio;

// Intenta sobrescribir con diferente firma (esto no es sobrescritura real)
public class HijoIncorrectoFirma extends IncorrectoFirma {
    // Diferente firma: no tiene parámetros
    public void saludar() {
        System.out.println("Hola desde hijo");
    }
}
