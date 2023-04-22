/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

/**
 *
 * @author s6x
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Culo extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JPanel panel1;
    private JPanel panel2;
    private CardLayout cardLayout;
    private Timer timer;
    private float alpha;

    public Culo() {
        super("Panel Transition Example");

        // Crear los paneles
        mainPanel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLUE);

        // Agregar los paneles al mainPanel
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
        mainPanel.add(panel1, "Panel1");
        mainPanel.add(panel2, "Panel2");

        // Crear el timer para la animación
        timer = new Timer(10, this);
        alpha = 0.0f;

        // Agregar el mainPanel al JFrame
        add(mainPanel);

        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Actualizar la transparencia de los paneles
        alpha += 0.1f;
        if (alpha >= 1.0f) {
            alpha = 1.0f;
            timer.stop();
        }

        // Repintar los paneles
        panel1.repaint();
        panel2.repaint();
    }

    public void switchPanels() {
        // Iniciar la animación de transición
        alpha = 0.0f;
        timer.start();

        // Cambiar al siguiente panel
        cardLayout.next(mainPanel);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Dibujar la transición de los paneles
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }

    public static void main(String[] args) {
        Culo example = new Culo();
        example.switchPanels();
    }
}

