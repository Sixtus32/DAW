/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author s6x
 */
public class GestorVentanas extends JFrame {
    private volatile boolean running = false;
    private Thread thread;
            
    public GestorVentanas(){
        setTitle("Gestor Ventanas");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        add(new Lamina(thread));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new GestorVentanas();
    }

//    @Override
//    public void run() {
//        while (running) {            
//            
//        }
//    }
    
//    public void start(){
//        if(running){
//            return;
//        }
//        running=true;
//        thread=new Thread(this);
//        thread.start();
//        run();
//    }
    
}

class Lamina extends JPanel{
    private JButton boton1=new JButton("Start Game.");
    private JButton boton2=new JButton("Settings");
    private JButton boton3=new JButton("Close.");
    
    

    public Lamina(Thread thread) {
        add(boton1);
        add(boton2);
        add(boton3);
        Layer layer1=new Layer(thread, this);
        Layer layer2=new Layer(thread, this);
        
        add(layer1);
        add(layer2);
        
        boton1.addActionListener(layer2);
        boton2.addActionListener(layer1);
//        boton2.addActionListener(layer2);
    }

    public JButton getBoton1() {
        return boton1;
    }

    public JButton getBoton2() {
        return boton2;
    }

    public JButton getBoton3() {
        return boton3;
    }
    
    
}

abstract class Panel extends JPanel implements ActionListener{

    private static final long serialVersionUID = 1L;
    private Thread thread;
    
    public Panel(Thread thread) {
        this.thread=thread;
        setBackground(Color.black);
        setPreferredSize(new Dimension(200, 200));
    }
    
    
    public void panelRightMove(Panel panel, int mili){
        (new Thread(){
            @Override
            public void run() {
                for(int i=panel.getWidth(); i >= panel.getX() + panel.getWidth(); i-=2){
            try{
                Thread.sleep(mili);
                panel.setPreferredSize(new Dimension(i, panel.getHeight()));
                SwingUtilities.updateComponentTreeUI(panel);
            }catch(InterruptedException e){
                System.out.println("Algo salio mal en la aplicacionde layer.");
            }
        }
            }
            
        }).start();
        
    }
    
    
    public void panelLeftMove(Panel panel, int mili){
        (new Thread(){
            @Override
            public void run() {
                for(int i=panel.getWidth(); i <= panel.getX() + panel.getWidth(); i+=2){
            try{
                Thread.sleep(mili);
                panel.setPreferredSize(new Dimension(i, panel.getHeight()));
                SwingUtilities.updateComponentTreeUI(panel);
            }catch(InterruptedException e){
                System.out.println("Algo salio mal en la aplicacionde layer.");
            }
        }
            }
            
        }).start();
        
    }
}

class Layer extends Panel{

    private static final long serialVersionUID = 1L;
    private Lamina lamina;
    private boolean estado=true;

    public Layer(Thread thread,Lamina lamina) {
        super(thread);
        this.lamina=lamina;
    }

    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(estado){
            this.panelLeftMove(this, 1);
            estado=false;
        }else{
            
            this.panelRightMove(this, 1);
            estado=true;
        }
        
    }
    
}
