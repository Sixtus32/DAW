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
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StarfishDrawingExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int outerRadius = 50; // Radio de la estrella de mar
//        int innerRadius = outerRadius / 2; // Radio del círculo interior

        // Dibujar la estrella de mar
        int[] xPointsOuter = new int[10];
        int[] yPointsOuter = new int[10];
//        int[] xPointsInner = new int[10];
//        int[] yPointsInner = new int[10];
        int escala=2;
        for (int i = 0; i < 10; i++) {
            double outerX, outerY;

            if (i % 2 == 0) {
                outerX = centerX + outerRadius * Math.cos(2 * Math.PI * i / 10 - Math.PI / 2);
                outerY = centerY + outerRadius * Math.sin(2 * Math.PI * i / 10 - Math.PI / 2);
//                innerX = centerX + innerRadius * Math.cos(2 * Math.PI * (i + 0.5) / 10 - Math.PI / 2);
//                innerY = centerY + innerRadius * Math.sin(2 * Math.PI * (i + 0.5) / 10 - Math.PI / 2);
            } else {
                outerX = centerX + outerRadius / 2 * Math.cos(2 * Math.PI * i / 10 - Math.PI / 2);
                outerY = centerY + outerRadius / 2 * Math.sin(2 * Math.PI * i / 10 - Math.PI / 2);
//                innerX = centerX + innerRadius / 2 * Math.cos(2 * Math.PI * (i + 0.5) / 10 - Math.PI / 2);
//                innerY = centerY + innerRadius / 2 * Math.sin(2 * Math.PI * (i + 0.5) / 10 - Math.PI / 2);
            }

            xPointsOuter[i] = (int) outerX;
            yPointsOuter[i] = (int) outerY;
//            xPointsInner[i] = (int) innerX;
//            yPointsInner[i] = (int) innerY;
        }
        g.setColor(Color.yellow);
        g.fillPolygon(xPointsOuter, yPointsOuter, 10);
        g.setColor(Color.cyan);
        g.drawPolygon(xPointsOuter, yPointsOuter, 10);
//        g.drawPolygon(xPointsInner, yPointsInner, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Starfish Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StarfishDrawingExample panel = new StarfishDrawingExample();
        frame.add(panel);

        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}

