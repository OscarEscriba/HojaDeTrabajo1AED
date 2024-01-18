import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// Interfaz para la lógica de la radio
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
        // Puedes agregar la lógica según sea necesario
    }

    @Override
    public void avanzarDial() {
        // Implementación para avanzar en el dial de emisoras
        // Puedes agregar la lógica según sea necesario
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
    private int frecuencia = 150; // Frecuencia inicial para otra implementación

    @Override
    public void cambiarFrecuencia() {
        // Implementación específica para otra implementación de Radio
    }

    @Override
    public void avanzarDial() {
        // Implementación específica para otra implementación de Radio
    }

    @Override
    public int getFrecuencia() {
        return frecuencia;
    }
}

public class Ventana extends JFrame implements ActionListener {
    private Radio radio; // Interfaz para la lógica de la radio

    JButton boton1, boton2, boton3, boton4, boton5, boton6, AM, FM, izquierda, derecha;
    JButton subirVolumen, bajarVolumen, guardarEmisora, power;
    JLabel Estaciones, volumenLabel;
    int currentFrequency = 530;  // Frecuencia actual, inicializada en 530
    boolean isAM = true;  // Indica si está sintonizando en AM o FM
    int volume = 50; // Volumen actual, inicializado en 50
    private boolean radioEncendida = true; 

    public Ventana() {
        setLayout(null);

        boton1 = new JButton("1");
        boton1.setBounds(75, 250, 50, 30);
        boton1.addActionListener(this);
        add(boton1);

        // ... (otros botones)

        AM = new JButton("AM");
        AM.setBounds(325, 150, 100, 30);
        AM.addActionListener(this);
        add(AM);

        FM = new JButton("FM");
        FM.setBounds(325, 200, 100, 30);
        FM.addActionListener(this);
        add(FM);

        izquierda = new JButton("←");
        izquierda.setBounds(325, 50, 45, 30);
        izquierda.addActionListener(this);
        add(izquierda);

        derecha = new JButton("→");
        derecha.setBounds(375, 50, 45, 30);
        derecha.addActionListener(this);
        add(derecha);

        subirVolumen = new JButton("+");
        subirVolumen.setBounds(75, 50, 45, 30);
        subirVolumen.addActionListener(this);
        add(subirVolumen);

        bajarVolumen = new JButton("-");
        bajarVolumen.setBounds(125, 50, 45, 30);
        bajarVolumen.addActionListener(this);
        add(bajarVolumen);

        guardarEmisora = new JButton("Guardar");
        guardarEmisora.setBounds(175, 50, 80, 30);
        guardarEmisora.addActionListener(this);
        add(guardarEmisora);

        power = new JButton("Power");
        power.setBounds(275, 50, 80, 30);
        power.addActionListener(this);
        add(power);

        volumenLabel = new JLabel("Volumen: " + volume);
        volumenLabel.setBounds(175, 10, 200, 30);
        add(volumenLabel);

        Estaciones = new JLabel(Integer.toString(currentFrequency));
        Estaciones.setBounds(175, 100, 200, 100);
        Estaciones.setFont(new Font("Calibri", Font.BOLD, 50));
        add(Estaciones);
        
        // Inicializa la radio con la implementación por defecto (RadioAMFM)
        radio = new RadioAMFM();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Resto del código de actionPerformed
    }

    // Resto del código de la clase Ventana

    private void updateVolumeLabel() {
        volumenLabel.setText("Volumen: " + volume);
    }

    private void updateFrequencyLabel() {
        if (isAM) {
            Estaciones.setText(Integer.toString(currentFrequency));
        } else {
            Estaciones.setText(String.format("%.1f", currentFrequency / 10.0));
        }
    }

    private double[][] emisorasGuardadas = new double[6][2]; // Array para almacenar las emisoras guardadas (frecuencia y otros detalles)
    private void guardarEmisora(int botonNumero) {
    if (botonNumero >= 1 && botonNumero <= 6) {
        emisorasGuardadas[botonNumero - 1][0] = isAM ? currentFrequency : currentFrequency / 10.0;
        emisorasGuardadas[botonNumero - 1][1] = volume;
        JOptionPane.showMessageDialog(null, "Emisora guardada en el botón " + botonNumero);
    } else {
        JOptionPane.showMessageDialog(null, "Número de botón inválido. Debe ser entre 1 y 6.");
    }
    } 
    private void seleccionarEmisora(int botonNumero) {
        if (botonNumero >= 1 && botonNumero <= 6) {
            double frecuenciaGuardada = emisorasGuardadas[botonNumero - 1][0];
            double volumenGuardado = emisorasGuardadas[botonNumero - 1][1];
            if (isAM) {
                Estaciones.setText(String.valueOf((int) frecuenciaGuardada));
            } else {
                Estaciones.setText(String.format("%.1f", frecuenciaGuardada));
            }
            volumenLabel.setText("Volumen: " + volumenGuardado);
        } else {
            JOptionPane.showMessageDialog(null, "Número de botón inválido. Debe ser entre 1 y 6.");
        }
    }

    // Métodos para deshabilitar y habilitar todos los botones
    private void disableAllButtons(Container container) {
        // Resto del código de disableAllButtons
        for (Component component : container.getComponents()) {
            if (component instanceof AbstractButton && component != power) {
                ((AbstractButton) component).setEnabled(false);
            }
            if (component instanceof Container) {
                disableAllButtons((Container) component);
            }
        }
    }

    private void enableAllButtons(Container container) {
        // Resto del código de enableAllButtons
        for (Component component : container.getComponents()) {
            if (component instanceof AbstractButton && component != power) {
                ((AbstractButton) component).setEnabled(true);
            }
            if (component instanceof Container) {
                enableAllButtons((Container) component);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana ventana = new Ventana();
            ventana.setBounds(0, 0, 450, 350);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}

