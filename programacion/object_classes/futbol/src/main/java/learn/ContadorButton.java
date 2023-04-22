/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learn;

/**
 *
 * @author s6x
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContadorButton extends JButton {
    private int contador; // Variable para almacenar el contador

    public ContadorButton() {
        // Configurar el botón
        setBackground(Color.white);
        setFocusPainted(false);
        setPreferredSize(new Dimension(50, 50));

        setFont(new Font("Arial", Font.PLAIN, 85));
        
        // Configurar el contador inicial
        contador = 0;
        
        // Agregar ActionListener para manejar clics en el botón
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++; // Incrementar el contador al hacer clic
                repaint(); // Redibujar el botón para actualizar el contador
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar el botón con el contador y el signo "+"
        Graphics2D g2d=(Graphics2D) g;
        
        
        Rectangle2D r=new Rectangle2D.Double(5, 5, (int) (getWidth() - (getWidth() * 0.2)), (int)(getHeight() - (getHeight() * 0.05)));
        g2d.setColor(new Color(23,23,23));
        g2d.fill(r);
        Rectangle2D r2=new Rectangle2D.Double(r.getMaxX(), 5, (int) (getWidth() - (getWidth() * 0.8)), (int)(getHeight() - (getHeight() * 0.05)));
        g2d.setColor(new Color(75,23,23));
        g2d.fill(r2);
        Rectangle2D r3=new Rectangle2D.Double(r.getMaxX(), 5, (int) (getWidth() - (getWidth() * 0.2)), (int)(getHeight() - (getHeight() * 0.05)));
        g2d.setColor(Color.CYAN);
        g2d.fill(r3);
        g2d.setColor(Color.WHITE);
        g2d.drawString(Integer.toString(contador), getWidth() / 2 - 5, getHeight() / 2 + 5);
        g2d.setFont(new Font("Arial", Font.BOLD, 75));
        g2d.setColor(Color.GREEN);
        g2d.drawString("+", (float)r2.getCenterX() + 2,(float)r2.getCenterY());
//        g2d.drawString("+", getWidth() / (2 + 5), getHeight() / 2 + 5);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ContadorButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ContadorButton boton = new ContadorButton();
        frame.add(boton);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
