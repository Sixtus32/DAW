/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * En el método de Lámina, donde declaramos los botones, añadimos lo siguiente:

botonAzul.setActionCommand("botonAzul");

botonAmarillo.setActionCommand("botonAmarillo");

botonRojo.setActionCommand("botonRojo");

Y en el método actionPerformed, en lugar de usar un getSource para capturar los eventos de ratón, utilizamos getActionCommand, tal que así:

public void actionPerformed (ActionEvent e)

    String action = e.getActionCommand();

		

		if(action.equals("botonAzul")) {


		} else if (action.equals("botonAmarillo")) {

			

			setBackground(Color.yellow);

			

		} else {

			

			setBackground(Color.red);

		}
}
 */
/**
 *
 * @author s6x
 */
public class Evento_I {
    public static void main(String[] args) {
        MarcoBotones f=new MarcoBotones();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}


class MarcoBotones extends JFrame{

    public MarcoBotones(){
        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);
        setLocationRelativeTo(null);
        add(new LaminaBotones());
    }
    
}

class LaminaBotones extends JPanel implements ActionListener{

    private static final long serialVersionUID = 1L;
    private final JButton botonAzul=new JButton("Blue");
    private final JButton botonAmarrillo=new JButton("Yellow");
    private final JButton botonRojo=new JButton("Red");
    
    
    public LaminaBotones() {
        
        add(botonAzul);
        add(botonAmarrillo);
        add(botonRojo);
        
        botonAzul.setCursor(new Cursor("Blue"){}
        );
        
        botonAzul.addActionListener(this);
        botonAmarrillo.addActionListener(this);
        botonRojo.addActionListener(this);
//        botonAzul.setActionCommand("Blue");
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado=e.getSource();
        
        if (botonPulsado==botonAzul){
            setBackground(Color.blue);
        }else if(botonPulsado==botonAmarrillo){
            setBackground(Color.yellow);
        }else if(botonPulsado==botonRojo){
            setBackground(Color.red);
        }else{
            setBackground(new Color(0, true));
        }


    }
    
}
