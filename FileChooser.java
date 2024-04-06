import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class FileChooser {
    public static void main(String[] args) {
        Ventana6 miVentana = new Ventana6();
        miVentana.setTitle("File Chooser");
    }


}

class Ventana6 extends JFrame {
    private static Panel6 miPanel;
    Ventana6(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        miPanel = new Panel6();
        add(miPanel);
        setVisible(true); 
    }

    private class Panel6 extends JPanel {
        private JMenuBar barraMenu;
        private JMenu menuArchivo;
        private JMenuItem menuAbrir;
        private JSeparator separador;
        private JMenuItem menuSalir;
        private JFileChooser elegirArchivo;
        Panel6(){
            setLayout(null);
            barraMenu = new JMenuBar();
            setJMenuBar(barraMenu);
            barraMenu.setBounds(0,0,400,30);
            menuArchivo = new JMenu("Archivo");
    
            menuAbrir = new JMenuItem("Abrir");        
            separador = new JSeparator();
            menuSalir = new JMenuItem("Salir");
    
            barraMenu.add(menuArchivo);
            menuArchivo.add(menuAbrir);    
            menuArchivo.add(separador);
            menuArchivo.add(menuSalir); 

            elegirArchivo = new JFileChooser();
            menuAbrir.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    int resp;
                            
                    resp=elegirArchivo.showOpenDialog(miPanel);
                            
                    if (resp==JFileChooser.APPROVE_OPTION) {
                        JOptionPane.showMessageDialog(null,elegirArchivo.getSelectedFile().toString());

                    } else if (resp==JFileChooser.CANCEL_OPTION) {

                        JOptionPane.showMessageDialog(null,"Se pulsó la opción Cancelar");            
                    }
                        
                }
                
            });

    
        }
    }
}


