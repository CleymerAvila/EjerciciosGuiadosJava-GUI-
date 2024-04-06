import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class BarraDeHerramientas {
    public static void main(String[] args) {
        Ventana4 miVentana = new Ventana4();
        miVentana.setTitle("Barra De Herramientas");
    }

}

class Ventana4 extends JFrame {


    Ventana4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);

        Panel4 miPanel = new Panel4();
        add(miPanel);
        setVisible(true);
    }


}

class Panel4 extends JPanel {

    private static JMenuBar barraMenu;
    private static JToolBar barraHerramienta;
    private static JButton btnUno;
    private static JButton btnDos;
    private static JButton btnTres;
    private static JButton btnCuatro;


    Panel4(){
        setLayout(null);
        barraMenu = new JMenuBar();
        barraMenu.setBounds(0,0, 400, 40);
        barraHerramienta = new JToolBar();
        barraHerramienta.setFloatable(false);
        barraMenu.add(barraHerramienta);


        btnUno = new JButton("Uno");
        btnDos = new JButton("Dos");
        btnTres = new JButton("Tres");
        btnCuatro = new JButton("Cuatro");
        barraHerramienta.add(btnUno);
        barraHerramienta.add(btnDos);
        barraHerramienta.add(btnTres);
        barraHerramienta.add(btnCuatro);
        
        Evento evento = new Evento();
        btnUno.addActionListener(evento);
        btnDos.addActionListener(evento);
        btnTres.addActionListener(evento);
        btnCuatro.addActionListener(evento);


        add(barraMenu);

    }

    private class Evento implements ActionListener {


        public void actionPerformed(ActionEvent e){
            if (e.getSource()==btnUno) {
                JOptionPane.showMessageDialog(null,"Activaste el botón uno");
            } else if (e.getSource()==btnDos) {
                JOptionPane.showMessageDialog(null,"Activaste el botón dos");
            } else if (e.getSource()==btnTres) {
                JOptionPane.showMessageDialog(null,"Activaste el botón tres");
            } else {
                JOptionPane.showMessageDialog(null,"Activaste el botón cuatro");
            }
        }
    }
}


