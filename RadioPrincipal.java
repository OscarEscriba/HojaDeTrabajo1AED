/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana;

/**
 *
 * @author Oscar Escriba
 */
import java.util.Scanner;

public class RadioPrincipal implements Interface {

    private boolean encendido;
    private int banda;
    private float frecuencia;
    private int vol;

    public RadioPrincipal() {
        this.encendido = false;
        this.banda = AM;
        this.frecuencia = 530.0f;
        this.vol = 50;
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("La radio se ha encendido.");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("La radio se ha apagado.");
    }

    @Override
    public void setVolume(int i) {
        if (encendido) {
            vol = Math.max(0, Math.min(i, 100));
            System.out.println("Volumen ajustado a " + vol);
        }
    }

    @Override
    public void cambiarBanda(int nuevaBanda) {
        if (encendido) {
            if (nuevaBanda == AM || nuevaBanda == FM) {
                banda = nuevaBanda;
                System.out.println("Banda cambiada a " + (banda == AM ? "AM" : "FM"));
            } else {
                System.out.println("Banda no válida.");
            }
        }
    }

    @Override
    public void subirEmisora() {
        if (encendido) {
            frecuencia += (banda == AM) ? 10.0f : 0.2f;
            System.out.println("Emisora subida a " + frecuencia);
        }
    }

    @Override
    public void bajarEmisora() {
        if (encendido) {
            frecuencia -= (banda == AM) ? 10.0f : 0.2f;
            System.out.println("Emisora bajada a " + frecuencia);
        }
    }

    @Override
    public void guardarEmisora(int i, float frec) {
        if (encendido) {
            System.out.println("Emisora guardada en la posición " + i);
        }
    }

    @Override
    public void seleccionarEmisora(int i) {
        if (encendido) {
            System.out.println("Emisora seleccionada desde la posición " + i);
        }
    }

    @Override
    public float getEmisora() {
        return (encendido) ? frecuencia : 0;
    }

    @Override
    public int getVolumen() {
        return (encendido) ? vol : 0;
    }

    @Override
    public int getBanda() {
        return (encendido) ? banda : 0;
    }

    public static void main(String[] args) {
        RadioPrincipal miRadio = new RadioPrincipal();
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso
        miRadio.encender();
        miRadio.setVolume(75);
        miRadio.cambiarBanda(FM);
        miRadio.subirEmisora();
        miRadio.guardarEmisora(1, miRadio.getEmisora());
        miRadio.seleccionarEmisora(1);
        System.out.println("Emisora actual: " + miRadio.getEmisora() + " Banda: " + miRadio.getBanda() +
                " Volumen: " + miRadio.getVolumen());

        miRadio.apagar();
        scanner.close();
    }
}


