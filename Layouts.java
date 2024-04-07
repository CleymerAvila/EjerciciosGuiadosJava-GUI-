import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Layouts {
    public static void main(String[] args) {
        Ventana10 ventana1 = new Ventana10();
        ventana1.setTitle("FlowLayout");
        Ventana11 ventana2 = new Ventana11();
        ventana2.setTitle("BorderLayout");
        Ventana12 ventana3 = new Ventana12();
        ventana3.setTitle("GridLayout");
    }
}

class Ventana10 extends JFrame {
    private static JLabel etiqueta;
    private static JButton boton;
    Ventana10(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 350);
        setResizable(true);
        setLocation(30, 250);

        PanelFlowLayout mipanel = new PanelFlowLayout();
        add(mipanel);
        setVisible(true);
    }
    class PanelFlowLayout extends JPanel {
        PanelFlowLayout(){
            setLayout(new FlowLayout());
            etiqueta = new JLabel("Este es una etiqueta");
            boton = new JButton("Botón");
            add(etiqueta);
            add(boton);

        }
    }
}

class Ventana11 extends JFrame {
    Ventana11(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 350);
        setResizable(true);
        setLocation(420, 250);
        PanelBorderLayout mipanel = new PanelBorderLayout();
        add(mipanel);
        setVisible(true);
    }

    class PanelBorderLayout extends JPanel {
        PanelBorderLayout(){
            setLayout(new BorderLayout());
            JButton boton1 = new JButton("boton 1");
            JButton boton2 = new JButton("boton 2");
            JButton boton3= new JButton("boton 3");
            JButton boton4= new JButton("boton 4");
            JButton boton5 = new JButton("boton 5");

            add(boton1,BorderLayout.NORTH);
            add(boton2, BorderLayout.EAST);
            add(boton3, BorderLayout.WEST);
            add(boton4, BorderLayout.CENTER);
            add(boton5, BorderLayout.SOUTH);

        }
    }
}

class Ventana12 extends JFrame {
    Ventana12(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 350);
        setResizable(true);
        setLocation(830, 250);
        PanelGridLayout mipanel = new PanelGridLayout();
        add(mipanel);
        setVisible(true);
    }

    class PanelGridLayout extends JPanel {
        PanelGridLayout(){
            setLayout(new GridLayout(2,3));
            JButton boton1 = new JButton("boton 1");
            JButton boton2 = new JButton("boton 2");
            JButton boton3= new JButton("boton 3");
            JButton boton4= new JButton("boton 4");
            JButton boton5 = new JButton("boton 5");
            JButton boton6 = new JButton("Boton 6");

            add(boton1);
            add(boton2);
            add(boton3);
            add(boton4);
            add(boton5);
            add(boton6);

        }
    }
}

