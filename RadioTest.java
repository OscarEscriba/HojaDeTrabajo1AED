/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ventana;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Oscar Escriba
 */
public class RadioPrincipalTest {
    
    public RadioPrincipalTest() {
    }

    /**
     * Test of encender method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testEncender() {
        System.out.println("encender");
        RadioPrincipal instance = new RadioPrincipal();
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of apagar method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testApagar() {
        System.out.println("apagar");
        RadioPrincipal instance = new RadioPrincipal();
        instance.apagar();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setVolume method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testSetVolume() {
        System.out.println("setVolume");
        int i = 0;
        RadioPrincipal instance = new RadioPrincipal();
        instance.setVolume(i);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of cambiarBanda method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testCambiarBanda() {
        System.out.println("cambiarBanda");
        int nuevaBanda = 0;
        RadioPrincipal instance = new RadioPrincipal();
        instance.cambiarBanda(nuevaBanda);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of subirEmisora method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testSubirEmisora() {
        System.out.println("subirEmisora");
        RadioPrincipal instance = new RadioPrincipal();
        instance.subirEmisora();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of bajarEmisora method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testBajarEmisora() {
        System.out.println("bajarEmisora");
        RadioPrincipal instance = new RadioPrincipal();
        instance.bajarEmisora();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of guardarEmisora method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testGuardarEmisora() {
        System.out.println("guardarEmisora");
        int i = 0;
        float frec = 0.0F;
        RadioPrincipal instance = new RadioPrincipal();
        instance.guardarEmisora(i, frec);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of seleccionarEmisora method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testSeleccionarEmisora() {
        System.out.println("seleccionarEmisora");
        int i = 0;
        RadioPrincipal instance = new RadioPrincipal();
        instance.seleccionarEmisora(i);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEmisora method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testGetEmisora() {
        System.out.println("getEmisora");
        RadioPrincipal instance = new RadioPrincipal();
        float expResult = 0.0F;
        float result = instance.getEmisora();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getVolumen method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testGetVolumen() {
        System.out.println("getVolumen");
        RadioPrincipal instance = new RadioPrincipal();
        int expResult = 0;
        int result = instance.getVolumen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getBanda method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testGetBanda() {
        System.out.println("getBanda");
        RadioPrincipal instance = new RadioPrincipal();
        int expResult = 0;
        int result = instance.getBanda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class RadioPrincipal.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RadioPrincipal.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
