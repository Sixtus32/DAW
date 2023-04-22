/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

/**
 *
 * @author s6x
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujoCirculo extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Configurar color de fondo
        setBackground(Color.WHITE);
        
        // Configurar color de trazo
        g.setColor(Color.PINK);
        
        // Dibujar círculo rosa
        int radio = 100; // Radio del círculo
        int x = getWidth() / 2 - radio; // Coordenada x del círculo
        int y = getHeight() / 2 - radio; // Coordenada y del círculo
        g.fillOval(x, y, 2 * radio, 2 * radio);
        
        // Configurar color de trazo y fuente para la exclamación
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 100);
        g.setFont(font);
        
        // Dibujar exclamación blanca en el centro del círculo
        g.drawString("!", getWidth() / 2 - 50, getHeight() / 2 + 40);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujo de Círculo");
        DibujoCirculo panel = new DibujoCirculo();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
