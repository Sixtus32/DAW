/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

/**
 *
 * @author s6x
 */
import java.awt.*;
import javax.swing.*;

public class EjemploCentrarLabel extends JFrame {
    
    public EjemploCentrarLabel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejemplo Centrar Label Encima");

        // Crear un JPanel principal con GridBagLayout
        JPanel panelPrincipal = new JPanel(new GridBagLayout());

        // Crear un JLabel y configurar su tamaño
        JLabel label = new JLabel("Etiqueta");
        label.setPreferredSize(new Dimension(80, 80)); // Establecer tamaño del JLabel
        label.setHorizontalAlignment(JLabel.CENTER); // Centrar horizontalmente el texto en el JLabel
        label.setVerticalAlignment(JLabel.CENTER); // Centrar verticalmente el texto en el JLabel

        // Crear un JButton
        JButton button = new JButton("Botón");

        // Configurar GridBagConstraints para el JLabel
        GridBagConstraints gbcLabel = new GridBagConstraints();
        gbcLabel.gridx = 0; // Columna 0
        gbcLabel.gridy = 0; // Fila 0
        gbcLabel.anchor = GridBagConstraints.CENTER; // Centrar el JLabel
        gbcLabel.insets = new Insets(0, 0, 10, 0); // Espacio inferior de 10 píxeles

        // Configurar GridBagConstraints para el JButton
        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.gridx = 0; // Columna 0
        gbcButton.gridy = 1; // Fila 1
        gbcButton.anchor = GridBagConstraints.CENTER; // Centrar el JButton

        // Agregar el JLabel y el JButton al panelPrincipal con los GridBagConstraints configurados
        panelPrincipal.add(label, gbcLabel);
        panelPrincipal.add(button, gbcButton);

        // Agregar el panelPrincipal al JFrame
        add(panelPrincipal);

        pack(); // Ajustar el tamaño del JFrame automáticamente
        setLocationRelativeTo(null); // Centrar el JFrame en la pantalla
    }

    public static void main(String[] args) {
        EjemploCentrarLabel ejemplo = new EjemploCentrarLabel();
        ejemplo.setVisible(true);
    }
}

