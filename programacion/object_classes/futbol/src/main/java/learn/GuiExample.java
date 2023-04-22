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
import java.awt.event.*;
import javax.swing.*;

public class GuiExample {

    private JFrame mainFrame; // Ventana principal
    private JInternalFrame internalFrame; // Ventana interna
    private JButton closeButton; // Botón de cierre
    private JButton openButton;

    public GuiExample() {
        // Crear la ventana principal
        mainFrame = new JFrame("Ventana Principal");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());

        // Crear la ventana interna
        

        // Crear el botón de cierre
        closeButton = new JButton("Cerrar");
        openButton=new JButton("Open button");
        
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana interna al hacer clic en el botón de cierre
                internalFrame.dispose();
            }
        });
        
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalFrame = new JInternalFrame("Ventana Interna", true, true, true, true);
        
                internalFrame.setLayout(new FlowLayout());
                internalFrame.setSize(400, 450);
                internalFrame.setVisible(true);
                internalFrame.add(closeButton, BorderLayout.CENTER);
                mainFrame.add(internalFrame, BorderLayout.CENTER);
            }
        });

        // Agregar el botón de cierre a la ventana interna
//        
        mainFrame.add(openButton, BorderLayout.SOUTH);

        // Agregar la ventana interna a la ventana principal
        

        // Configurar la ventana principal
        mainFrame.setSize(1100, 850);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiExample();
            }
        });
    }
}

