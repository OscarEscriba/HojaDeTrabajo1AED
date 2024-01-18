import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
    private Radio radio;

    private JButton boton1, boton2, boton3, boton4, boton5, boton6, AM, FM, izquierda, derecha;
    private JLabel Estaciones, volumenLabel;

    public Ventana(Radio radio) {
        this.radio = radio;
        setLayout(null);

        boton1 = new JButton("1");
        boton1.setBounds(75, 250, 50, 30);
        add(boton1);

        boton2 = new JButton("2");
        boton2.setBounds(125, 250, 50, 30);
        add(boton2);

        boton3 = new JButton("3");
        boton3.setBounds(175, 250, 50, 30);
        add(boton3);

        boton4 = new JButton("4");
        boton4.setBounds(225, 250, 50, 30);
        add(boton4);

        boton5 = new JButton("5");
        boton5.setBounds(275, 250, 50, 30);
        add(boton5);

        boton6 = new JButton("6");
        boton6.setBounds(325, 250, 50, 30);
        add(boton6);

        AM = new JButton("AM");
        AM.setBounds(325, 150, 100, 30);
        add(AM);

        FM = new JButton("FM");
        FM.setBounds(325, 200, 100, 30);
        add(FM);

        izquierda = new JButton("←");
        izquierda.setBounds(325, 50, 45, 30);
        add(izquierda);

        derecha = new JButton("→");
        derecha.setBounds(375, 50, 45, 30);
        add(derecha);

        Estaciones = new JLabel("530");
        Estaciones.setBounds(175, 100, 200, 100);
        Estaciones.setFont(new Font("Calibri", Font.BOLD, 50));
        add(Estaciones);

        volumenLabel = new JLabel("Volumen: 50");
        volumenLabel.setBounds(50, 50, 200, 30);
        add(volumenLabel);

        // Agregar ActionListener a los botones
        boton1.addActionListener(this);
        // Agregar ActionListener a otros botones...

        // Resto del código...
    }

    public static void main(String[] args) {
        Radio radioAMFM = new RadioAMFM(); // Puedes cambiar a OtraImplementacionRadio
        Ventana ventana = new Ventana(radioAMFM);
        ventana.setBounds(0, 0, 450, 350);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implementar la lógica para cada botón según sea necesario
        if (e.getSource() == AM) {
            radio.cambiarFrecuencia();
            updateFrequencyLabel();
        } else if (e.getSource() == FM) {
            radio.cambiarFrecuencia();
            updateFrequencyLabel();
        } else if (e.getSource() == izquierda) {
            radio.avanzarDial();
            updateFrequencyLabel();
        } else if (e.getSource() == derecha) {
            radio.avanzarDial();
            updateFrequencyLabel();
        }
        // Implementar lógica para otros botones...
    }

    private void updateFrequencyLabel() {
        Estaciones.setText(String.valueOf(radio.getFrecuencia()));
    }

    // Resto del código...

}

// Interfaz Radio
interface Radio {
    void cambiarFrecuencia();
    void avanzarDial();
    int getFrecuencia();
}

// Implementación de Radio para AM/FM
class RadioAMFM implements Radio {
    private int frecuencia = 530; // Frecuencia inicial

    @Override
    public void cambiarFrecuencia() {
        // Implementación para cambiar entre AM y FM
        // Aquí puedes agregar la lógica según sea necesario
    }

    @Override
    public void avanzarDial() {
        // Implementación para avanzar en el dial de emisoras
        // Aquí puedes agregar la lógica según sea necesario
    }

    @Override
    public int getFrecuencia() {
        return frecuencia;
    }
}

// Otra posible implementación de Radio
class OtraImplementacionRadio implements Radio {
    // Implementación para otra clase que implemente Radio
    // Puedes agregar la lógica según sea necesario
}
