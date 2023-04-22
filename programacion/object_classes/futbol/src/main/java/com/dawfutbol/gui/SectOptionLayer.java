/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dawfutbol.gui;

import com.dawfutbol.gui.components.OptionDisplayButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;


/**
 *
 * @author s6x
 */
public final class SectOptionLayer extends Layer {

    private static final long serialVersionUID = 1L;
    
    private OptionDisplayButton btnCarrera;
    private OptionDisplayButton btnEscenario;
    private OptionDisplayButton btnLive;
    private OptionDisplayButton btnAmistoso;

    public SectOptionLayer() {
        setBackground(new Color(0, true));
        setPreferredSize(new Dimension(700, 350));
        initComponents();
        addComponents();   
    }
    
    
    
    

//    private 
    @Override
    protected void initComponents() {
        btnCarrera=new OptionDisplayButton("Carrera", 
                                           "Tu oportunidad para formar el mejor equipo del mundo", 
                                           300, 90);
        btnCarrera.addActionListener((e) -> {
            System.out.println("Ready to play");
        });
        btnEscenario=new OptionDisplayButton("Escenario", 
                                            "Siguiente escenario en 7h 59h 18s", 
                                            50, 90);
        btnLive=new OptionDisplayButton("Live", 
                                        "Enfrenta tu dream team a los mejores del mundo", 
                                        300, 90);
        btnAmistoso=new OptionDisplayButton("Amistoso", 
                                            "Compite en un partido amistoso si conexión", 
                                            50, 90);
        
    }
    
    private void addComponents(){
        
        setLayout(new GridLayout(2, 2, 10, 8));
        add(btnCarrera);
        add(btnEscenario);
        add(btnLive);
        add(btnAmistoso);
    }
    
    
    
}
