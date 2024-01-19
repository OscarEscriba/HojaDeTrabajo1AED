/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana;

/**
 *
 * @author Oscar Escriba
 */
public class MiRadio implements Interface {
    public MiRadio() {
        this.encendido = true;
        this.banda = fm;
        this.frecuencia = 101.1f;
        this.vol = 50;
    }

    private boolean encendido;
    private boolean banda; //true => FM
    private boolean fm = true;
    private float frecuencia;
    private int vol;
    float emisoras[] = new float[12];


    /**
     * cambia el atributo que indica si la radio esta encendida a true
     */
    
    public void encender() {
        this.encendido = true;
        this.banda = fm;
        this.frecuencia = 101.1f;
        this.vol = 50;
    }

    /**
     * cambia el atributo que indica si la radio esta encendida a false
     */
    
    public void apagar() {
        this.encendido = false;
        this.banda = fm;
        this.frecuencia = 0f;
        this.vol = 0;
    }

    /**
     * esta funcion le asigna al volumen un valor ente 0 y 100
     * @param i valor que el usuario ingresa
     */
    
    public void setVolume(int i) {
        if (encendido)
            this.vol = i %101;
    }

    /**
     * cambia la banda en la que esta la radio a la selecionada y por defecto se pone en una emisora válida segun la banda
     * @param banda
     */
    
    public void cambiarBanda(int banda) {
        if (encendido) {
            if (banda == AM) {
                this.banda = !fm;
                this.frecuencia = 660f;
            } else {
                this.banda = fm;
                this.frecuencia = 101.1f;
            }
        }
    }

    /**
     * aumenta la frecuencia de la emisora a la siguiente válida
     */
    
    public void subirEmisora() {
        if (encendido){
            if (banda == fm){
                frecuencia += 0.2f;
            }
            else{
                frecuencia += 10f;
            }
        }
    }

    /**
     * disminuye la frecuencia de la emisora a la anterior válida
     */
    
    public void bajarEmisora() {
        if (encendido) {
            if (banda = fm) {
                frecuencia -= 0.2f;
            } else {
                frecuencia -= 10f;
            }
        }
    }

    /**
     * guarda las emisoras favoritas en una lista
     * @param i indice da la lista
     * @param frec frecuencia que se desea guardar (se acepta cualquier valor)
     */
    
    public void guardarEmisora(int i, float frec) {
        if (encendido) {
            i = i % 12;
            emisoras[i] = frec;
        }
    }

    /**
     * cambia la emisora actual a la que est guardada en la posision i de la lista
     * @param i la emisora elegida
     */
    
    public void seleccionarEmisora(int i) {
        i = 1%12;
        if (encendido){
            this.frecuencia = emisoras[i];
            if (i < 107.9 ){
                this.banda = fm;
            }
            else{
                this.banda = !fm;
            }
        }
    }

    /**
     * @return emisora actual y 0 si la radio esta apagada
     */
    
    public float getEmisora() {
        if (encendido){
            return this.frecuencia;
        }
        return 0;
    }

    /**
     * @return volumen actual de la radio
     */
    
    public int getVolumen() {
        if (encendido){
            return this.vol;
        }
        return 0;
    }

    /**
     * @return banda actual, fm si la radio esta apagada
     */

    public int getBanda() {
        if (encendido && banda != fm){
            return 0;
        }
        return 1;
    }
}