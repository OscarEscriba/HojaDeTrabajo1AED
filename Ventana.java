/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

 package com.mycompany.ventana;

 /**
  *
  * @author Oscar Escriba
  */
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
 public class Ventana extends JFrame {
     private RadioPrincipal radio;
 
     private JLabel emisoraLabel;
     private JLabel volumenLabel;
     private JLabel bandaLabel;
 
     public Ventana() {
         // Inicializar la clase RadioPrincipal
         radio = new RadioPrincipal();
 
         // Configurar JFrame
         setTitle("Radio GUI");
         setSize(400, 200);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new GridLayout(4, 1));
 
         // Configurar etiquetas
         emisoraLabel = new JLabel("Emisora: " + radio.getEmisora());
         volumenLabel = new JLabel("Volumen: " + radio.getVolumen());
         bandaLabel = new JLabel("Banda: " + (radio.getBanda() == Interface.AM ? "AM" : "FM"));
 
         // Configurar botones
         JButton encenderButton = new JButton("Encender");
         JButton apagarButton = new JButton("Apagar");
         JButton subirEmisoraButton = new JButton("Subir Emisora");
         JButton bajarEmisoraButton = new JButton("Bajar Emisora");
 
         // Configurar acciones para los botones
         encenderButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 radio.encender();
                 actualizarEtiquetas();
             }
         });
 
         apagarButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 radio.apagar();
                 actualizarEtiquetas();
             }
         });
 
         subirEmisoraButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 radio.subirEmisora();
                 actualizarEtiquetas();
             }
         });
 
         bajarEmisoraButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 radio.bajarEmisora();
                 actualizarEtiquetas();
             }
         });
 
         // Agregar componentes al JFrame
         add(encenderButton);
         add(apagarButton);
         add(subirEmisoraButton);
         add(bajarEmisoraButton);
         add(emisoraLabel);
         add(volumenLabel);
         add(bandaLabel);
 
         // Hacer visible el JFrame
         setVisible(true);
     }
 
     private void actualizarEtiquetas() {
         emisoraLabel.setText("Emisora: " + radio.getEmisora());
         volumenLabel.setText("Volumen: " + radio.getVolumen());
         bandaLabel.setText("Banda: " + (radio.getBanda() == Interface.AM ? "AM" : "FM"));
     }
 
     public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new Ventana();
             }
         });
     }
 }
 
