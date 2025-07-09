/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejercicio;

public class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez respira a través de sus branquias.");
    }
}
