/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learn;

/**
 *
 * @author s6x
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample extends JFrame implements ActionListener {
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JButton btnNext;
    private JButton btnPrevious;

    public CardLayoutExample() {
        // Configurar el JFrame
        setTitle("CardLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Crear el panel principal con CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Crear paneles de contenido
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);

        // Agregar paneles de contenido al panel principal con CardLayout
        cardPanel.add(panel1, "Panel 1");
        cardPanel.add(panel2, "Panel 2");
        cardPanel.add(panel3, "Panel 3");

        // Crear botones para navegar entre los paneles
        btnNext = new JButton("Next");
        btnNext.addActionListener(this);
        btnPrevious = new JButton("Previous");
        btnPrevious.addActionListener(this);

        // Agregar botones al JFrame
        setLayout(new BorderLayout());
        add(cardPanel, BorderLayout.CENTER);
        add(btnNext, BorderLayout.EAST);
        add(btnPrevious, BorderLayout.WEST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            // Mostrar el siguiente panel
            cardLayout.next(cardPanel);
        } else if (e.getSource() == btnPrevious) {
            // Mostrar el panel anterior
            cardLayout.previous(cardPanel);
            
        }
    }

    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
            CardLayoutExample example = new CardLayoutExample();
            example.setVisible(true);
//        });
    }
}

