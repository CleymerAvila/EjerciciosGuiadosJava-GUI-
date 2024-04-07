import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class DistribucionPanelesYLayouts {
    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setTitle("Paneles y Layouts");

    }

}

class VentanaPrincipal extends JFrame {
    VentanaPrincipal(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        PanelTitulo panel1 = new PanelTitulo();
        PanelBotonera panel2 = new PanelBotonera();
        PanelDatos panel3 = new PanelDatos();
        PanelVerificacion panel4 = new PanelVerificacion();
        PanelEstado panel5 = new PanelEstado();

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.WEST);
        add(panel3, BorderLayout.CENTER);
        add(panel4, BorderLayout.EAST);
        add(panel5, BorderLayout.SOUTH);
        pack();
        setVisible(true);;
    }

    class PanelTitulo extends JPanel {
        PanelTitulo(){
            setLayout(new FlowLayout());
            setBorder(BorderFactory.createEmptyBorder(10,30,10,30));
            setBackground(Color.PINK);
            JLabel etiTitulo = new JLabel("Ejercicio de distribucion de paneles y Layouts");
            JLabel etiAutor = new JLabel("por Cleymer A.");
            add(etiTitulo);
            add(etiAutor);
        }
    }

    class PanelBotonera extends JPanel {
        PanelBotonera(){
            setLayout(new GridLayout(4,1, 40, 40));
            setBorder(BorderFactory.createEmptyBorder(50,30,50,30));
            setBackground(Color.magenta);
            JButton btn1 = new JButton("Boton 1");
            JButton btn2 = new JButton("Boton 2");
            JButton btn3 = new JButton("Boton 3");
            JButton btn4 = new JButton("Boton 4");

            add(btn1);
            add(btn2);
            add(btn3);
            add(btn4);

        }
    }

    class PanelDatos extends JPanel {
        PanelDatos(){
            setLayout(new GridLayout(2, 2, 5, 20));
            setBorder(BorderFactory.createEmptyBorder(130,20,150,20));
            setBackground(new Color(200,130,200));
            JLabel dato1 = new JLabel("Datos 1: ");
            JLabel dato2 = new JLabel("Datos 2: ");
            JTextField areaTexto1 = new JTextField();
            JTextField areaTexto2 = new JTextField();
            add(dato1);            
            add(areaTexto1);
            add(dato2);
            add(areaTexto2);
        }
    }

    class PanelVerificacion extends JPanel {
        PanelVerificacion(){
            setLayout(new GridLayout(4, 1, 80, 20));
            setBorder(BorderFactory.createEmptyBorder(50, 10, 50, 10));
            setBackground(new Color(133,99,103));
            JCheckBox chkbox1 = new JCheckBox("Casilla 1");
            JCheckBox chkbox2 = new JCheckBox("Casilla 2");
            JCheckBox chkbox3 = new JCheckBox("Casilla 3");
            JCheckBox chkbox4 = new JCheckBox("Casilla 4");
            chkbox1.setBackground(new Color(133,99,103));
            chkbox2.setBackground(new Color(133,99,103));
            chkbox3.setBackground(new Color(133,99,103));
            chkbox4.setBackground(new Color(133,99,103));

            add(chkbox1);
            add(chkbox2);
            add(chkbox3);
            add(chkbox4);

        }
    }

    class PanelEstado extends JPanel {
        PanelEstado(){
            setLayout(new GridLayout(1,4,20,30));
            setBorder(BorderFactory.createEmptyBorder(30, 100, 10, 100));
            setBackground(new Color(203,132,23));
            JLabel etiUno = new JLabel("Etiqueta Uno");
            JLabel etiDos = new JLabel("Etiqueta dos");
            JLabel etiTres = new JLabel("Etiqueta tres");
            JLabel etiCuatro = new JLabel("Etiqueta cuatro");

            add(etiUno);
            add(etiDos);
            add(etiTres);
            add(etiCuatro);

        }
    }
} 
