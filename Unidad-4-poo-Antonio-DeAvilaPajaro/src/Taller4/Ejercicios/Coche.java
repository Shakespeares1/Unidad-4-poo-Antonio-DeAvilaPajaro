/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Ejercicios;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            this.velocidadMaxima = 0;
        }
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
